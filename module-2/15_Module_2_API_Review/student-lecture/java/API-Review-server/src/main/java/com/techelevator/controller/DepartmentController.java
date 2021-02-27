package com.techelevator.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.model.Department;
import com.techelevator.model.DepartmentDAO;


/**
 * Controller to handle api requests for department resources.
 */
@RestController
public class DepartmentController {
	
	DepartmentDAO deptDAO; // define a reference
	public DepartmentController(DepartmentDAO deptDAO) {
		logAPICall("Called with the Path /departments");
		this.deptDAO = deptDAO; // use spring dependency injection to instantiate a DepartmentDaO object
		// We need to include @component annotation in JdBC department dao
	}
// write a controller that will handle the path "/departments" to send back all of Departments	
	@RequestMapping(path="/departments", method=RequestMethod.GET)
	public List<Department> listAllDepartments(){
	List<Department> theDepartments;	// use the department dao to get all the departments from the database
		theDepartments = deptDAO.getAllDepartments();
		
		return theDepartments;
	}
	// This controller with a specific departmetn form the department resource
	// use the departmentDAO get byDepartmentbyId()
	// the api will use to invoke this is: /departments{id}
	@RequestMapping(path="/departments/{id}", method=RequestMethod.GET)
	public Department getDepartmentById(@PathVariable  Long id) {
		logAPICall ("Called with the path: /departments/"+id);
		return deptDAO.getDepartmentById(id);
	}
	
	
	
public void logAPICall(String message) {
	 LocalDateTime now = LocalDateTime.now();
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm:ss.A");
     String timeNow = now.format(formatter);
     System.out.println(timeNow + "-" + message);
 }
}


