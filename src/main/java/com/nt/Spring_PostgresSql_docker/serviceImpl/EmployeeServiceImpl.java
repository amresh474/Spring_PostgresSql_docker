package com.nt.Spring_PostgresSql_docker.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Spring_PostgresSql_docker.dao.EmployeeDao;
import com.nt.Spring_PostgresSql_docker.model.Employee;
import com.nt.Spring_PostgresSql_docker.service.EmployeeService;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

}
