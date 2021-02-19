
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
		ArrayList<Department> listOfDepts = new ArrayList<>();
		String sqlGetAllDepts = "SELECT department_id, name " +
								"FROM department ";
		SqlRowSet allDepts = jdbcTemplate.queryForRowSet(sqlGetAllDepts);
		while(allDepts.next()) {
			Department theDept = mapRowToDepartment(allDepts);
			listOfDepts.add(theDept);
		}
		return listOfDepts;
	
	}
	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		ArrayList<Department> listOfDepts = new ArrayList<>();
		String searchDeptNameSql = "SELECT department_id, name " +
								   "FROM department " +
								   "WHERE name ilike ?";
		SqlRowSet theDepts = jdbcTemplate.queryForRowSet(searchDeptNameSql, "%" + nameSearch + "%");
		if(theDepts.next()) {
			Department aDepartment = new Department();
			aDepartment = mapRowToDepartment(theDepts);
			listOfDepts.add(aDepartment);
		}
		return listOfDepts;
	}
	
	
	@Override
	public void saveDepartment(Department updatedDepartment) {
			String updateDepartment = "UPDATE department " +
									   "SET name = ?" +
									   "WHERE department_id = ?";
					              
									  
			
			jdbcTemplate.update(updateDepartment, updatedDepartment.getName(), updatedDepartment.getDepartment_id());
			
	}
	@Override
	public Department createDepartment(Department newDepartment) {
		String sqlInsertNewDepartment = "INSERT INTO department(department_id, name) "  +
								        "VALUES(? , ?)";
		
		
		jdbcTemplate.update(sqlInsertNewDepartment, newDepartment.getDepartment_id(),
				 newDepartment.getName());
		
		return newDepartment;
		
	}
	@Override
	public Department getDepartmentById(Long id) {
		Department aDept = new Department();
		String sqlGetDeptById = "SELECT department_id, name " +
								"FROM department " +
								"WHERE department_id = ?";
		
		SqlRowSet DeptById = jdbcTemplate.queryForRowSet(sqlGetDeptById, id);
		aDept = mapRowToDepartment(DeptById);
		return aDept;}
	private Department mapRowToDepartment(SqlRowSet theRows) {
		// use the setters in your department pojo to assign the values from the SQLrowSet
		Department  aDepartment = new Department();
		aDepartment.setDepartment_id(theRows.getLong("department_id"));
		aDepartment.setName(theRows.getString("name"));
		return aDepartment;
	}
}
;


