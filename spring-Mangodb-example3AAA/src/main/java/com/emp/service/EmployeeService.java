package com.emp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Employee addEmp(Employee emp) {
		return employeeRepository.insert(emp);
	}

	public Employee update(Employee emp) {

		return employeeRepository.save(emp);
	}

	public void delete(String id) {

		employeeRepository.deleteById(id);
	}

	public Map<String, Object> getAllEmpPage(int pageNo, int pageSize, String sortBy) {
		Map<String, Object> response = new HashMap<String, Object>();
		
		Sort sort = Sort.by(sortBy);
		Pageable page = PageRequest.of(pageNo,pageSize, sort);
		Page<Employee> employePage  = employeeRepository.findAll(page);
		
		response.put("data", employePage.getContent());
		response.put("total No of page", employePage.getTotalPages());
		response.put("Total no of Elements", employePage.getTotalElements());
		response.put("Current page No", employePage.getNumber());
		
		return response;
	}

	public List<Employee> getAllByExample(Employee emp) {
	Example<Employee> e = Example.of(emp);
		return employeeRepository.findAll(e);
	}

}
