package com.techelevator.item;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class UserJdbcDao implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserJdbcDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// To insert a date into a prepared statement, wrap the date in
	// `Date.valueOf()`
	// method: `Date.valueOf(myObject.getCreated())`

	@Override
	public void save(User newUser) {
		// Implement this method to save user to database
		String sql = "INSERT INTO Users (first_name, last_name, role, id, email, createdVALUES (?,?,?,?,?,?)";
			int rows = jdbcTemplate.update(sql, newUser.getFirstName(), newUser.getLastName(), newUser.getRole(), newUser.getId(), newUser.getCreated());
			return;
		
		
	}

	@Override
	public List<User> getAllUsers() {
		// Implement this method to pull in all users from database
		List<User> allUsers = new ArrayList<>();
		String sqlGetAllUsers = "SELECT first_name, last_name FROM User";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllUsers);
		while (results.next()) {
			User userResult = mapRowToUser(results);
			allUsers.add(userResult);
		}
		return allUsers;
		
		}

	private User mapRowToUser(SqlRowSet results) {
		User userRow = new User();
		userRow.setId(results.getLong("id"));
		userRow.setFirstName(results.getString("first_name"));
		userRow.setLastName(results.getString("last_name"));
		userRow.setEmail(results.getString("email"));
		userRow.setRole(results.getString("role"));
		userRow.setCreated(results.getDate("created").toLocalDate());
		return userRow;
	}

}
