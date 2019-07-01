package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.model.Employee;
import com.employee.model.Leave;
import com.employee.service.impl.LeaveServiceImpl;
import com.employee.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private LeaveServiceImpl service;

	@PostMapping("employee")
	public Employee insert(@RequestBody Employee employee) {
		return employeeService.insertDetail(employee);

	}

	@GetMapping("employee")
	public List<Employee> getall() {
		return employeeService.get();
	}

	@PutMapping("employee/{id}/leave")
	public Leave create(@PathVariable long id, @RequestBody Leave leave) {
		return service.creates(id, leave);
	}

	@GetMapping("employee/{id}")
	public Optional<Employee> getById(@PathVariable long id) {
		return employeeService.getid(id);
	}

	@PutMapping("employee/{id}")
	public Employee update(@PathVariable long id, @RequestBody Employee employee) {
		return employeeService.update(employee);
	}
}




















//	@PostMapping("{id/leave}")
//	public Optional<Employee> applyLeave(@PathVariable long employeeId,Leave leave) {
//	 Optional<Employee> employee= leaveService.postleaveid(employeeId);
//	}

//	@PostMapping("employee/{id}/leave")
//  public Leave putLeave(@PathVariable long id, @RequestBody Leave put)  {	
//		return service.putLeave(put);
//	}
//	

//  @PostMapping("employee/{id}/leave")
//  public Leave putLeave(@RequestBody Leave put) throws ServiceException {	
//		return leaveService.putLeave(put);
//	}
//

//	@DeleteMapping("employee")
//	public void delete() {
//		employeeService.deleteall();
//	}

