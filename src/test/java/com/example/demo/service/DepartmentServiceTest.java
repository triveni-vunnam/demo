package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	@MockBean
	private DepartmentRepository departmentRepository;
		
	 
  //@BeforeEach what it will do is this particular test() method will be called for each and test case added to the class
	@BeforeEach
	void test() {
 
	//	Department department=Department.builder().deptName("IT").deptAddress("Hyderabad").deptCode("it-09").deptId(1L).build();
	//	Mockito.when(departmentRepository.findByDeptNameIgnoreCase("IT").thenReturn(department));
	}

	@Test
	@DisplayName(" get data based on valid department name")
	public void whenValidDepartmentName_thenDepartmentShouldFound() {
		String deptName = "ece";
		Department found = departmentService.fetchDepartmentByName(deptName);
		assertEquals(deptName, found.getDeptName());
	}

}
