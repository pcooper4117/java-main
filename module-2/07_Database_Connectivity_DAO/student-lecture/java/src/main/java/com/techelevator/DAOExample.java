package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;

public class DAOExample {

	public static void main(String[] args) {
	
		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");
		// pass the cityDAO constructor the data source we want it to use
		CityDAO dao = new JDBCCityDAO(worldDataSource);
		
		City smallville = new City();	// instantiate a city
		smallville.setCountryCode("USA"); // assign a values
		smallville.setDistrict("KS");
		smallville.setName("Smallville");
		smallville.setPopulation(42080);
		
		dao.save(smallville);
		
		City theCity = dao.findCityById(smallville.getId());
		
	}

}
