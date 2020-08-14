package com.techelevator.projects.view;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;

public class JDBCProjectDAOIntegrationTest {
	
	private static final String TEST_PROJECT = "SpaceX";
	private static SingleConnectionDataSource dataSource; 
	private JDBCProjectDAO dao;
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
		String sqlInsertProject = "INSERT INTO project (project_id, name, from_date, to_date) VALUES (7, ?, '2018-01-01', '2020-11-01')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertProject, TEST_PROJECT);
		dao = new JDBCProjectDAO(dataSource);
	}
	
	@After
	public void postTest() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void testGetAllActiveProjects() {
		//Arrange
		boolean projectExists = false;
		//Act
		for(Project project : dao.getAllActiveProjects()) {
			String test = project.getName();
			if(test.equals("SpaceX")) {
				projectExists = true;
			}
		}
		//Assert
		Assert.assertTrue(projectExists);
		
	}
	
//	@Test
//	public void testRemoveEmployeeFromProject() {
//		String sqlRemoveProject = "SELECT project_id, employee_id FROM project_employee";
//		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlRemoveProject);
//		results.next();
//		long employeeId = results.getLong("employee_id");
//		long projectId = results.getLong("project_id");
//		dao.removeEmployeeFromProject(projectId, employeeId);
//		String sqlRemoveProject2 = "SELECT project_id, employee_id FROM project_employee WHERE project_id = ? AND employee_id = ?";
//		SqlRowSet results2 = jdbcTemplate.queryForRowSet(sqlRemoveProject2, projectId, employeeId);
//		Assert.assertFalse(results2.next());
		
//		String sqlInsertProject = "SELECT project_id, employee_id FROM project_employee";
//		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlInsertProject);
//		results.next();
//		long employeeId = results.getLong("employee_id");
//		long projectId = results.getLong("project_id");
//		dao.removeEmployeeFromProject(projectId, employeeId);
//		String sqlInsertProject2 = "SELECT project_id, employee_id FROM project_employee WHERE project_id = ? AND employee_id = ?";
//		SqlRowSet results2 = jdbcTemplate.queryForRowSet(sqlInsertProject2, projectId, employeeId);
//		Assert.assertFalse(results2.next());
//	}
	
	@Test
	public void testAddEmployeeToProject() {
		dao.addEmployeeToProject(5L, 1L);
		String sqlInsertProject = "SELECT project_id, employee_id FROM project_employee WHERE project_id = 5 AND employee_id = 1";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlInsertProject);
		Assert.assertTrue(results.next());
		
	}
	
	
	
	

}
