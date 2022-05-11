package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {

	 public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long deptId);

	public void deletedepartmentById(Long deptId);

	public Department fetchDepartmentByName(String deptName);

//	public Department updateDepartment(Long deptId, Department department);
	

}
