package com.techelevator.projects.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

public class JDBCEmployeeDAOIntegrationTest {

	private static SingleConnectionDataSource dataSource;
	private JDBCEmployeeDAO dao;
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
	public static void destroyDataSource() throws SQLException {
		dataSource.destroy();
	}

	@Before
	public void setUp() {
		String sqlInsertEmployee = "INSERT INTO employee (employee_id, department_id, first_name, last_name, birth_date, gender, hire_date)"
				+ "VALUES (15, 3, 'John', 'Smith', '2005-12-12', 'M', '2020-01-01')";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertEmployee);
		String sqlInsertEmployee2 = "INSERT INTO employee (employee_id, department_id, first_name, last_name, birth_date, gender, hire_date)"
				+ "VALUES (16, 2, 'Jane', 'Smith', '2004-12-12', 'F', '2020-01-01')";
		jdbcTemplate.update(sqlInsertEmployee2);
		dao = new JDBCEmployeeDAO(dataSource);
	}

	@After
	public void postTest() throws SQLException {
		dataSource.getConnection().rollback();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetAllEmployees() {
		String sqlGetAllEmployees = "SELECT * FROM employee";
		int size = jdbcTemplate.queryForList(sqlGetAllEmployees).size();

		Assert.assertEquals(size, dao.getAllEmployees().size());
	}

	@Test
	public void testSearchByName() {
		List<Employee> employeeList = new ArrayList<>();
		// String sqlSearchByName = "SELECT * FROM employee WHERE first_name = 'Jane'
		// AND last_name = 'Smith'";
		// SqlRowSet result = jdbcTemplate.queryForRowSet(sqlSearchByName);
		boolean employeeExists = false;
		employeeList = dao.searchEmployeesByName("Jane", "Smith");
		for (Employee employee : employeeList) {
			if (employee.getFirstName().equals("Jane") && employee.getLastName().equals("Smith")) {
				employeeExists = true;
			}
		}

		Assert.assertTrue(employeeExists);
		Assert.assertNotNull(employeeExists);

	}

	@Test
	public void testSearchNameByDepartmentId() {
		List<Employee> employees = new ArrayList<>();
		String x = "";
		String y = "";
		String sqlGetEmployeesByDepartmentId = "SELECT * FROM employee WHERE department_id = '3'";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesByDepartmentId);
		while (results.next()) {
			if (results.getString("first_name").equals("John")) {
				x = results.getString("first_name");
			}
		}
		employees = dao.getEmployeesByDepartmentId(3);
		for (Employee employee : employees) {
			if (employee.getFirstName().equals("John")) {
				y = employee.getFirstName();
			}
		}
		Assert.assertEquals(y, x);

	}

	@Test
	public void testGetEmployeesWithoutProjects() {

		List<Employee> employees = new ArrayList<>();
		String resultsName = "";
		String searchName = "";
		String sqlGetEmployeesWithoutProjects = "SELECT * FROM employee LEFT JOIN project_employee ON project_employee.employee_id = employee.employee_id"
				+ " WHERE project_employee.employee_id IS NULL OR project_employee.project_id IS NULL";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesWithoutProjects);
		while (results.next()) {
			if (results.getString("first_name").equals("John")) {
				resultsName = results.getString("first_name");

			}
		}
		employees = dao.getEmployeesWithoutProjects();
		for (Employee employee : employees) {
			if (employee.getFirstName().equals("John")) {
				searchName = employee.getFirstName();
			}
		}

		Assert.assertEquals(resultsName, searchName);

	}

	@Test
	public void testChangeEmployeeDepartment() {
		dao.changeEmployeeDepartment(15L, 4L);
		String sqlChangeEmployeeDepartment = "SELECT * FROM employee WHERE employee_id = 15";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlChangeEmployeeDepartment);
		results.next();
		Assert.assertEquals(4L, results.getLong("department_id"));
	}

	@Test
	public void testGetEmployeesByProjectId() {
		List<Employee> employees = new ArrayList<>();
		String resultsName = "";
		Long searchName = 0L;
		boolean isEqual = false;
		String sqlInsertProjectEmployeeID = "INSERT INTO project_employee (project_id, employee_id) VALUES (3, 16)";
		jdbcTemplate.update(sqlInsertProjectEmployeeID);
		String sqlGetEmployeesBYProjectId = "SELECT employee.employee_id, department_id, first_name, last_name, birth_date, gender, hire_date"
				+ " FROM employee JOIN project_employee ON project_employee.employee_id = employee.employee_id"
				+ " WHERE project_employee.project_id = 3";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesBYProjectId);
		while (results.next()) {
			if (results.getString("first_name").equals("Jane")) {
				resultsName = results.getString("first_name");
			}
		}
		employees = dao.getEmployeesByProjectId(3L);
		for (Employee employee : employees) {
			if (employee.getId().equals(16L)) {

				searchName = employee.getId();
				isEqual = true;
			}
		}

		Assert.assertTrue(isEqual);

	}

}
