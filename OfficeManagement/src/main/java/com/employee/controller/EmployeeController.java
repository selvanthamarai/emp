package com.employee.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.model.Employee;
import com.employee.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;


	@PostMapping("employee")
	public Employee insert(@RequestBody Employee employee) {
		return employeeService.insertDetail(employee);

	}

	@GetMapping("employee")
	public List<Employee> getall() {
		return employeeService.get();
	}
	
	@GetMapping("employee/{id}")
	public Optional<Employee> getById(@PathVariable long id) {
		return employeeService.getid(id);
	}

	@PutMapping("employee/{id}")
	public Employee update(@PathVariable long id, @RequestBody Employee employee) {
		return employeeService.update(id,employee);
	}
	
	@DeleteMapping("employee/{id}")
	public void deleteById(@PathVariable long id) {
		  employeeService.delete(id);
		
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

