package com.techelevator;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestJDBVCdepartment {

private long test_department_id =1;
private String test_name;
private String aDepartment;
	private static SingleConnectionDataSource dataSource;
private JDBCDepartmentDAO deptDao;

@BeforeClass
public static void setupDataSource() {
	dataSource = new SingleConnectionDataSource();
	dataSource.setUrl("jdbc:postgresql://localhost:5432/projectsDAO");
	dataSource.setUsername("postgres");
	dataSource.setPassword("postgres1");

	dataSource.setAutoCommit(false);
}
	
	
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
}
	
	@Before
	public void testSetup()
	{
JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
deptDao = new JDBCDepartmentDAO(dataSource);
	}		

@After
public void rollback() throws SQLException {
	dataSource.getConnection().rollback();
}

/////////////////////////////////////////////////////////////////////////////////////////////////
@Test
public void testCreateDept () {
	

//Arrange - set up data
// Create a new dept
Department newDept = new Department();
newDept.setName("Jasons Meatballs");
// Act - actual run the method
Department returnedDept;
returnedDept = deptDao.createDepartment(newDept);
// Assert -verify
		// check to see if dept object was returned
assertNotNull(returnedDept);
assertEquals(newDept.getName(), returnedDept.getName());

}
////////////////////////////////////////////////////////////////////////////////////////////////////
@Test public void testGetAllDept() {
	//Arrange
Department aDepartment = makeDepartment();
List<Department> results = deptDao.getAllDepartments();
assertNotNull(results);


}
///////////////////////////////////////////////////////////////////////////////////////////////////////
@Test
public void testSaveDept () {
Department aDepartment = new Department();
aDepartment = makeDepartment();
String newDepartmentName = "test_name";
aDepartment.setName("test_name");
Department updatedDepartment = aDepartment;
deptDao.saveDepartment(updatedDepartment);
List<Department> results = deptDao.searchDepartmentsByName(newDepartmentName);
assertEquals(aDepartment.getName(), results.get(0).getName());

	}
///////////////////////////////////////////////////////////////////////////////////////////////////////
@Test 
public void test_get_Department_By_Id() {
	Department aDepartment = makeDepartment();
	Department returnedDept = deptDao.getDepartmentById(aDepartment.getDepartment_id());
	assertNotNull(returnedDept);
	assertEquals(aDepartment.getName(), returnedDept.getName());
	assertEquals(aDepartment.getDepartment_id(), returnedDept.getDepartment_id());
}

//HELPER METHODS//////////////////////////////////////////////////////////////////////////////////////
private Department makeDepartment() {
	Department aDepartment = new Department();
	aDepartment.setDepartment_id(test_department_id);
	aDepartment.setName(test_name);
	return aDepartment;
}

	
}	
	
	
	
	
