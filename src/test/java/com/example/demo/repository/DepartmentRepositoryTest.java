package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.demo.entity.Department;

@DataJdbcTest
class DepartmentRepositoryTest {

	private DepartmentRepository departmentRepository ;
	private TestEntityManager entityManager;
	@BeforeEach
	void setUp() {
		//Department department=Department.builder().deptName("IT").deptAddress("Hyderabad").deptCode("it-09").deptId(1L).build();;
		
	}

}
