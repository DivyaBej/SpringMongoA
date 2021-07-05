package com.emp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	@PostMapping("/")
	public Employee addEmp(@RequestBody Employee emp) {
		return employeeService.addEmp(emp);
	}

	@PutMapping("/")
	public Employee update(@RequestBody Employee emp) {
		return employeeService.update(emp);
	}

	@DeleteMapping("/{id}")
	public void delete(@RequestParam("id") String id) {
		employeeService.delete(id);
	}

	@GetMapping("/page")
	public Map<String, Object> getAllEmpPages(@RequestParam(name = "pageno", defaultValue = "0") int pageNo,
			@RequestParam(name = "pagesize", defaultValue = "2") int pageSize,
			@RequestParam(name = "sortBy", defaultValue = "id") String sortBy) {
		return employeeService.getAllEmpPage(pageNo, pageSize, sortBy);
	}

	@GetMapping("/example")
	public List<Employee> getAllByExample(@RequestBody Employee emp) {
		return employeeService.getAllByExample(emp);
	}

}
