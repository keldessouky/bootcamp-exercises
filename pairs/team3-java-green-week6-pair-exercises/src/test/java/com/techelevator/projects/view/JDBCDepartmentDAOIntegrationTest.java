package com.techelevator.projects.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;

public class JDBCDepartmentDAOIntegrationTest {
	
	private static String TEST_DEPARTMENT = "HR";
	
	private static SingleConnectionDataSource dataSource; 
	private JDBCDepartmentDAO dao;
	private JdbcTemplate jdbcTemplate;
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		dataSource.setAutoCommit(false);
	}
	
	@AfterClass 
	public static void destroyDataSource() throws SQLException{
		dataSource.destroy();
	}
	
	@Before
	public void preTest() {
		String sqlInsertDepartment = "INSERT INTO department (department_id, name) VALUES (?, ?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertDepartment, 10, TEST_DEPARTMENT);
		dao = new JDBCDepartmentDAO(dataSource);
	}
	
	@After
	public void postTest() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void testGetAllDepartments() {
		List<Department> departmentList = new ArrayList<>();
		boolean departmentExists = false;
		departmentList = dao.getAllDepartments();
		for(Department department : departmentList) {
			if (department.getName().equals(TEST_DEPARTMENT)) {
				departmentExists = true;
			}
		}
		Assert.assertTrue(departmentExists);
	}

	@Test
	public void testSearchDepartmentByName() {
		List<Department> departmentList = new ArrayList<>();
		boolean departmentExists = false;
		departmentList = dao.searchDepartmentsByName(TEST_DEPARTMENT);
		for(Department department : departmentList) {
			if (department.getName().equals(TEST_DEPARTMENT)) {
				departmentExists = true;
			}
		}
		Assert.assertTrue(departmentExists);
		Assert.assertNotNull(departmentExists);
	}
	
//	@Test
//	public void testSaveDepartment() {
//		List<Department> departmentList = new ArrayList<>();
//		boolean departmentExists = false;
//		Department newDepartment = new Department();
//		newDepartment.getName();
//		dao.saveDepartment(newDepartment);
//		String sqlSaveDepartment = "SELECT department_id, name FROM department WHERE department = 10";
//		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlSaveDepartment);
//		for(Department department : departmentList) {
//			if (department.getName().equals(TEST_DEPARTMENT)) {
//				department.setName("IRS");
//			}
//		}
//		
//		Assert.assertEquals("IRS", result.getString("name"));
//		
//	}
	
	@Test 
	public void testCreateDepartment() {
		Department newDepartment = new Department();
		newDepartment.setName("IRS");
		newDepartment.setId((long) 11);
		dao.createDepartment(newDepartment);
		
		Assert.assertNotNull(newDepartment);
	}
	
//	@Test 
//	public void testGetDepartmentById() {
//		Department newDepartment = new Department();
//		dao.saveDepartment(newDepartment);
//		
//		List<Department> departmentList = dao.getDepartmentById((long) 10);
//		
//		
//		
//		List<Department> departmentList = new ArrayList<>();
//		boolean departmentExists = false;
//		departmentList = dao.getDepartmentById((long) 10);
//		for(Department department : departmentList) {
//			if (department.getId().equals(10)) {
//				departmentExists = true;
//			}
//		}
//		Assert.assertTrue(departmentExists);
//		Assert.assertNotNull(departmentExists);
//	}
	

}
