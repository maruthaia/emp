package com.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RestController
@RequestMapping("/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@PostMapping(value = "/employee")
	private Employee postEmployee(@RequestBody Employee employee) {
		logger.info("Passed To post Method in Service Layer.");
		return employeeService.postEmployee(employee);
	}

	@GetMapping(value = "/employee/{name}")
	public List<Employee> getEmployee(@PathVariable String name) {
		logger.info("Passed To Get Method in Service Layer.");
		return employeeService.getEmployee(name);
	}

	@GetMapping(value = "/employee")
	public List<Employee> getEmployees() {
		logger.info("Passed To Get Method in Service Layer.");
		return employeeService.getEmployees();
	}

	@PutMapping(value = "/employee/{name}")
	public Employee putEmployee(@RequestBody Employee employee, @PathVariable String name) {
		logger.info("Passed To put Method in Service Layer.");
		return employeeService.putEmployee(employee, name);
	}

	@DeleteMapping(value = "/employee/{name}")
	public void deleteEmployee(@PathVariable String name) {
		logger.info("Passed To delete Method in Service Layer.");
		employeeService.deleteEmployee(name);

	}
}
