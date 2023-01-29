package com.employee.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	public Employee postEmployee(Employee employee) {
		logger.info("Passed To post Method in dao Layer.");
		return employeeDao.postEmployee(employee);
	}

	public List<Employee> getEmployees() {
		logger.info("Passed To get Method in dao Layer.");
		return employeeDao.getEmployees();
	}

	public Employee putEmployee(Employee employee, String name) {
		logger.info("Passed To put Method in dao Layer.");
		return employeeDao.putEmployee(employee, name);
	}

	public void deleteEmployee(String name) {
		logger.info("Passed To put Method in dao Layer.");
		employeeDao.deleteEmployee(name);
	}

	public List<Employee> getEmployee(String name) {
		logger.info("Passed To get Method in dao Layer.");
		return employeeDao.getEmployee(name);
	}

}
