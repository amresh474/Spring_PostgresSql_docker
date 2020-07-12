package com.nt.Spring_PostgresSql_docker.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nt.Spring_PostgresSql_docker.model.Employee;
@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {

}
