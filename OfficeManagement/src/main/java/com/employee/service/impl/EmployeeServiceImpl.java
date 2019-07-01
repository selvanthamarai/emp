package com.employee.service.impl;


import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.model.Employee;
import com.employee.model.Leave;
import com.employee.repository.EmployeeRepository;
import com.employee.repository.LeaveRepository;
import com.employee.services.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
   
	@Autowired
	private LeaveRepository repository;
	
	public Employee insertDetail(Employee employee) throws ServiceException {
		
	   return employeeRepository.save(employee);

	}

	public List<Employee> get() {
		return employeeRepository.findAll();
	}

	
	public Employee creates(long id,Leave leave) {
		
//		return repository.save(leave);
		Optional<Employee> empData = employeeRepository.findById(id);
		if(empData != null)  {
		
			System.out.println(">>>>>>>"+empData);
		}
		return null;
	}
	
	public Optional<Employee> getid(long id) {
		return employeeRepository.findById(id);
	}
	
	

	public Employee update(Employee employee) {
		return employeeRepository.save(employee);

	}

	public void deleteall() {
		employeeRepository.deleteAll();
	}

}
