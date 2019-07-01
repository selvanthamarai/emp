package com.employee.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;

import com.employee.model.Employee;
import com.employee.model.Leave;


public interface EmployeeService {

	
    public Employee insertDetail(Employee employee) throws ServiceException;
	
	public List<Employee> get();
	
	public Employee creates(long id,Leave leave);
	
	public Optional<Employee> getid(long id);
	
	public Employee update(Employee employee);
	
	public void deleteall();
}
