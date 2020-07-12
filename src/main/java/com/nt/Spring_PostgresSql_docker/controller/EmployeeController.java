package com.nt.Spring_PostgresSql_docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Spring_PostgresSql_docker.model.Employee;
import com.nt.Spring_PostgresSql_docker.service.EmployeeService;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employees")
	public Employee createEmployee(@Validated @RequestBody Employee employee) {
		logger.info("Insert employee...");
		return employeeService.save(employee);

	}

}
