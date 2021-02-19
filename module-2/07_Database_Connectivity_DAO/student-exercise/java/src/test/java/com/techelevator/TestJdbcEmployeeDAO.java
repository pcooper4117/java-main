package com.techelevator;
import static org.junit.Assert.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;
	public class TestJdbcEmployeeDAO {
		private long 		test_employee_id = 056424254254L;
		private long 		test_department_id = 45L;
		private String 		test_department_name = "Meatball";
		private String 		test_first_name = "John";
		private String 		test_last_name = "Doe";
		private LocalDate 	test_birth_date = LocalDate.of(2020, 1, 1);
		private String 		test_gender = "M";
		private LocalDate 	test_hire_date = LocalDate.of(2020, 2, 1);
	
	
	
	private static SingleConnectionDataSource dataSource;
	private JDBCEmployeeDAO dao;
	
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/ProjectDAO");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
	
		dataSource.setAutoCommit(false);
	}
	
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	
	}
	
	@Before
	public void setup() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sqlInsertDepartment = "INSERT INTO Department" + " (department_id, name)"
				+ " Values (45, Meatball)";
				jdbcTemplate.update(sqlInsertDepartment);
		
		
		String sqlInsertEmployee = "INSERT INTO employee" + " (employee_id, department_id, first_name, last_name, birth_date, gender, hire_date)"
															+ " Values (056424254254, 45, 'John', 'Doe', '2020, 1, 1', 'M', '2020, 2, 1')";
		
		jdbcTemplate.update(sqlInsertEmployee);
		
		
		
		
		
		dao = new JDBCEmployeeDAO(dataSource);


				
	}
	
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	public void test_search_Employee_By_Name() {
	Employee aEmployee = new Employee();
	aEmployee.setFirst_name(test_first_name);
	aEmployee.setLast_name(test_last_name);
	aEmployee.setBirth_date(test_birth_date);
	aEmployee.setGender(test_gender);
	aEmployee.setHire_date(test_hire_date);
	aEmployee.setDepartment_id(test_employee_id);
	
 List<Employee> results = dao.searchEmployeesByName(aEmployee.getFirst_name(), aEmployee.getLast_name());
  assertNotNull(results);
  assertEquals(1,results.size());
 assertEquals(results.get(0).getFirst_name(), aEmployee.getFirst_name());
 assertEquals(results.get(0).getFirst_name(), aEmployee.getLast_name());
 
 
 
	}
	}