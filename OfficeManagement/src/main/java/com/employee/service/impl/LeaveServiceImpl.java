package com.employee.service.impl;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.employee.model.Leave;
import com.employee.repository.LeaveRepository;
import com.employee.services.LeaveService;

@Component
public class LeaveServiceImpl implements LeaveService {
	@Autowired
	private LeaveRepository repository;

	public Leave creates(long id, Leave leave) {
		leave.setEmployeeId(id);
		Leave objleave = repository.save(leave);
		if (objleave != null) {
	
		System.out.println(">>>>>>>" + objleave);
		}
	return null;
		//return repository.save(leave);

	}

	public List <Leave> getid(long employeeId) {
		return repository.findByEmployeeId(employeeId);
	}

	
	
	
}

	
	
//public Employee creates(long id, Leave leave) {
//
////	return repository.save(leave);
//	Optional<Employee> empData = employeeRepository.findById(id);
//	if (empData != null) {
//
//		System.out.println(">>>>>>>" + empData);
//	}
//	return null;
//}
	
	
	
	
	
	
	
	
	
//public Leave putLeave(Leave leave) throws ServiceException {
//	try {
//
//		Leave leaveObj = repository.save(leave);
//		return leaveObj;
//
//	} catch (Exception e) {
//		return null;
//	}
//}
//
//public List<Leave> getAll() {
//	return repository.findAll();
//}
//
//public Optional<Leave> getid(long employeeId) {
//	return repository.findById(employeeId);
//}
//
//public Leave update(Leave leave) {
//	try {
//		Leave leaveObj = repository.save(leave);
//		return leaveObj;
//	} catch (Exception e) {
//		return null;
//	}
//}
//
//public void deleteall() {
//	repository.deleteAll();
//}