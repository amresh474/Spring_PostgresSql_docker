package com.nt.Spring_PostgresSql_docker.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.Spring_PostgresSql_docker.dao.EmployeeDao;
import com.nt.Spring_PostgresSql_docker.dao.EmployeeRepository;
import com.nt.Spring_PostgresSql_docker.model.Employee;

@Repository("EmployeeDaoImpl")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired(required = false)
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub

		Employee e1 = employeeRepository.save(employee);

		return e1;
	}

}
