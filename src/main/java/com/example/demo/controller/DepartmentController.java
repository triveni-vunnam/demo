package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;



@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	private final Logger LOGGER = 
			LoggerFactory.getLogger(DepartmentController.class);
	@PostMapping("/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {

		LOGGER.info("Inside Postrequest of DepartmentController");
		return departmentService.saveDepartment(department);
		
	}
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){

		LOGGER.info("Inside fetchDepartmentList "
				+ "of DepartmentController");
		return departmentService.fetchDepartmentList();
		
	}
	
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long deptId){
		return departmentService.fetchDepartmentById(deptId);
		
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long deptId){
		departmentService.deletedepartmentById(deptId);
		return "Department deleted Successfully!!";
		
	}
//	
//	@PutMapping("/departments/{id}")
//	public Department updateDepartmentById(@PathVariable("id") Long deptId,
//			@RequestBody Department department){
//			return departmentService.updateDepartment(deptId,department);		
//	}
	
	

	@GetMapping("/departments/name/{name}")
	public  Department fetchDepartmentByName(@PathVariable("name") String deptName){
		return departmentService.fetchDepartmentByName(deptName);
		
	
	
	
	
	}
	

}
