package com.employee.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
@Component
public class EmployeeDao {
	@Autowired
	private EmployeeRepository employeerepository;
	private static final Logger logger = LoggerFactory.getLogger(EmployeeDao.class);

	public Employee postEmployee(Employee employee) {
		logger.info("post the employee data");

		return employeerepository.save(employee);
	}

	public List<Employee> getEmployees() {
		logger.info("get the employees data");
		return employeerepository.findAll();
	}

	public List<Employee> getEmployee(String name) {
		logger.info("get the employees data");
		return employeerepository.findByName(name);
	}

	public Employee putEmployee(Employee employee, String name) {
		Employee emp = employeerepository.getByName(name);
		logger.info("update the employees data");
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		emp.setJobTitle(employee.getJobTitle());
		emp.setPlace(employee.getPlace());
		emp.setPhoneNumber(employee.getPhoneNumber());
		emp.setEmailId(employee.getEmailId());
		emp.setGender(employee.getGender());
		emp.setAddress(employee.getAddress());
		emp.setPhoneNumber(employee.getPhoneNumber());
		emp.setPlace(employee.getPlace());
		return employeerepository.save(emp);
	}

	public void deleteEmployee(String name) {
		logger.info("delete the employee  data");
		employeerepository.deleteByName(name);
	}

}
