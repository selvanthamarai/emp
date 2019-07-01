package com.employee.services;
import java.util.List;
import com.employee.model.Leave;

public interface LeaveService {

	public Leave creates(long id, Leave leave);

	public List <Leave> getid(long employeeId);
	
//	public Leave putLeave(Leave leave) throws ServiceException;

//	public List<Leave> getAll();

//	public Optional<Leave> getid(long employeeId);

//	public Leave update(Leave leave);

//	public void deleteall();

}
