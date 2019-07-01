package com.employee.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Leave;
import com.employee.service.impl.LeaveServiceImpl;

@RestController

public class LeaveController {

	@Autowired
	private LeaveServiceImpl service;

	@PostMapping("employee/leave")
	public Leave putLeave(@RequestBody Leave put) {
		return service.putLeave(put);
	}

	@GetMapping("employee/{employeeId}/leave")
	public Optional<Leave> getById(@PathVariable long employeeId) {
		return service.getid(employeeId);
	}

}


//@GetMapping("employee/{id}/leave")
//public Leave putLeave(@RequestBody Leave put) throws ServiceException {	
//	return service.putLeave(put);
//}

//@GetMapping("all")
//public List<Leave> getAll() {
//	return service.getAll();
//}

//@PutMapping("{id}")
//public Leave update(@PathVariable long id, @RequestBody Leave update) {
//	return service.update(update);
//}
//
//@DeleteMapping
//public void delete() {
//	service.deleteall();
//}