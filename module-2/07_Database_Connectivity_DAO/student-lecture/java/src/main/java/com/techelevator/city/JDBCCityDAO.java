// THIS IS THE DAO CONCRETE CLASS WHICH IMPLEMENTS THE METHODS REQUIRED BY THE INTERFACE
// NAME OF THE CLASS SHOULD BE JDBCTABLE-NAMEDAO
//
//

package com.techelevator.city;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCCityDAO implements CityDAO {

	private JdbcTemplate jdbcTemplate; // DEFINE REFERENCE VARIABLE FOR JDBC TEMPLATE OBJECT
// JDBC TEMPLATE CLASS CONTAINS ALL THE NECESSARY CODE TO INTERACT WITH THE DATABASE USING SPRING DAO'S
	
	public JDBCCityDAO(DataSource dataSource) { 			// CONSTRUCTOR FOR THE CLASS
		this.jdbcTemplate = new JdbcTemplate(dataSource);   // INSTANTIATE A JDBC TEMPLATE
	}														// ASSIGN IT TO REFERECNCE DEFINED ABOVE

	@Override
	public void save(City newCity) {
		// DEFINE A STRING TO HOLD THE SQL STATEMENT WE WANT TO RUN
		// QUESTION MARKS ARE PLACE HOLDERS FOR VALUES SPECIFIED WHEN STATEMENT IS EXECUTED
		// IN THIS EXAMPLE THE VALUES ARE COMING FROM THE OBJECT PASSED 
		// WE DONT KNOW VALUES UNTILL RUNTIME
		String sqlInsertCity = "INSERT INTO city(id, name, countrycode, district, population) " +
							   "VALUES(?, ?, ?, ?, ?)";
		newCity.setId(getNextCityId());// call a class method to get the next city id from database
		//
		// USE THE .UPDATE METHOD BECAUSE WE ARE EXECUTEING AND INSERT WITH CHANGES (UPDATES) DATA BASE
		// .UPDATE() WANTS THE STRING WITH THE SQL STATEMENT TO BE EXECUTED, FOLLOWED BY ANY VALUES FOR THE ? STATEMENTS
		// when we add a row to the city table the database will automactially assign serial
		// so we will ask the database manager what the next city id is and assign it ourselves
		jdbcTemplate.update(sqlInsertCity, newCity.getId(), // VALUE OF FIRST QUESTION MARK
										  newCity.getName(),// SECOND
										  newCity.getCountryCode(),// THIRD
										  newCity.getDistrict(),
										  newCity.getPopulation());
	}
	
	@Override
	public City findCityById(long id) {
		
		City theCity = null;
		String sqlFindCityById = "SELECT id, name, countrycode, district, population "+
							   "FROM city "+
							   "WHERE id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityById, id);
		if(results.next()) {
			theCity = mapRowToCity(results);
		}
		return theCity;
	}

	@Override   //ASK THE COMPILER TO OVERRIDE METHOD REQUIRED BY INTERFACE
	public List<City> findCityByCountryCode(String countryCode) {
		ArrayList<City> cities = new ArrayList<>();
		String sqlFindCityByCountryCode = "SELECT id, name, countrycode, district, population "+
										   "FROM city "+
										   "WHERE countrycode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindCityByCountryCode, countryCode);
		while(results.next()) {
			City theCity = mapRowToCity(results);
			cities.add(theCity);
		}
		return cities;
	}

	@Override
	public List<City> findCityByDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	private long getNextCityId() {
				// will return next sequential value from a sequence object
				// sequence object is used by postgres to generate serial values
				// sequence object may be defined by user and used by postgres or postgress will automatically define
		
		
		//														
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_city_id')");
		// we need to get the next city id out of the sql rowset and into a java variable
		if(nextIdResult.next()) {		// if sql rowset has data move to next line
			return nextIdResult.getLong(1); // get the long value in column one and return as long
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new city");
		}
	}

	private City mapRowToCity(SqlRowSet results) {
		City theCity;
		theCity = new City();
		theCity.setId(results.getLong("id"));
		theCity.setName(results.getString("name"));
		theCity.setCountryCode(results.getString("countrycode"));
		theCity.setDistrict(results.getString("district"));
		theCity.setPopulation(results.getInt("population"));
		return theCity;
	}
}
