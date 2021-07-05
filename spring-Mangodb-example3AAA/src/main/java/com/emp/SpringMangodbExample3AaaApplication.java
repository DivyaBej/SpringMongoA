package com.emp;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.model.Employee;
import com.emp.repository.EmployeeRepository;

@SpringBootApplication
public class SpringMangodbExample3AaaApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMangodbExample3AaaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Employee> listOfEmployee = new ArrayList<Employee>();

		Employee e1 = new Employee("BAT1", "MAN", "jhuhu", (float) 1000);
		Employee e2 = new Employee("BAT2", "MAN", "jhuhu", (float) 2000);
		Employee e3 = new Employee("BAT3", "MAN", "jhuhu", (float) 3000);
		Employee e4 = new Employee("BAT4", "MAN", "jhuhu", (float) 4000);
		Employee e5 = new Employee("BAT5", "MAN", "jhuhu", (float) 5000);
		Employee e6 = new Employee("BAT6", "MAN", "jhuhu", (float) 6000);

		listOfEmployee.add(e1);
		listOfEmployee.add(e2);
		listOfEmployee.add(e3);
		listOfEmployee.add(e4);
		listOfEmployee.add(e5);
		listOfEmployee.add(e6);

		employeeRepository.insert(listOfEmployee);

	}

}
