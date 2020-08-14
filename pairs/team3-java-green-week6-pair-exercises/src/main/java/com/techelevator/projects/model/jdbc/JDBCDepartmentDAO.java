package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {
		ArrayList<Department> departmentsList = new ArrayList<>();
		String sqlGetAllDepartments = "SELECT * FROM department";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllDepartments);
		while (results.next()) {
			Department departments = mapRowToDepartment(results);
			departmentsList.add(departments);
		}

		return departmentsList;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		ArrayList<Department> departmentsList = new ArrayList<>();
		String sqlSearchDepartmentsByName = "SELECT * FROM department WHERE name = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchDepartmentsByName, nameSearch);

		while (results.next()) {
			Department departments = mapRowToDepartment(results);
			departmentsList.add(departments);
		}
		return departmentsList;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		String sqlSaveDepartment = "UPDATE department SET name = ? WHERE department_id = ?";
		jdbcTemplate.update(sqlSaveDepartment, updatedDepartment.getName(), updatedDepartment.getId());
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		Department newDept = new Department();
		String sqlCreateDepartment = "INSERT INTO department (name) VALUES (?)";
		jdbcTemplate.update(sqlCreateDepartment, newDepartment.toString());
		newDept.setId(getNextDepartmentId());

		return newDept;
	}

	@Override
	public Department getDepartmentById(Long id) {
		Department department = new Department();
		String sqlGetDepartmentById = "SELECT * FROM department WHERE department_id = ?";
		SqlRowSet departmentName = jdbcTemplate.queryForRowSet(sqlGetDepartmentById, id);
		if (departmentName.next()) {
			department = mapRowToDepartment(departmentName);
		}
		return department;
	}

	private long getNextDepartmentId() {
		SqlRowSet nextDept = jdbcTemplate.queryForRowSet("SELECT nextval('seq_department_id')");
		if (nextDept.next()) {
			return nextDept.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new department.");
		}
	}

	private Department mapRowToDepartment(SqlRowSet results) {
		Department departments = new Department();
		departments.setId(results.getLong("department_id"));
		departments.setName(results.getString("name"));
		return departments;
	}

}
