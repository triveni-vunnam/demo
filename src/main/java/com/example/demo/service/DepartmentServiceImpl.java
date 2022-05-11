package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		
		return departmentRepository.findAll() ;
	}

	@Override
	public Department fetchDepartmentById(Long deptId) {
		
		return departmentRepository.findById(deptId).get();
	}

	@Override
	public void deletedepartmentById(Long deptId) {
		departmentRepository.deleteById(deptId);
		
	}

	@Override
	public Department fetchDepartmentByName(String deptName) {
		
		return departmentRepository.findByDeptNameIgnoreCase(deptName);
	}

//	@Override
//	public Department updateDepartment(Long deptId, Department department) {
//		Department depDB = departmentRepository.findById(deptId).get();
//		
//		if(Objects.nonNull(department.getDeptName()) &&
//				!"".equalsIgnoreCase(department.getDeptName())) {
//			depDB.setDeptName(department.getDeptName());
//		}
//			
//		if(Objects.nonNull(department.getDeptCode()) &&
//				!"".equalsIgnoreCase(department.getDeptCode())) {
//			depDB.setDeptCode(department.getDeptCode());
//		}
//		
//		if(Objects.nonNull(department.getDeptAddress()) &&
//				!"".equalsIgnoreCase(department.getDeptAddress())) {
//			depDB.setDeptAddress(department.getDeptAddress());
//		}
//		
//		
//		return departmentRepository.save(depDB);
//	}
	
	
	
	

}
