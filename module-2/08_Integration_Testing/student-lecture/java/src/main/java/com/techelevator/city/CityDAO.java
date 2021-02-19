package com.techelevator.city;

import java.util.List;

public interface CityDAO {

	public void save(City newCity); // add row

	public City findCityById(long id); // search city

	public List<City> findCityByCountryCode(String countryCode);		//search for city	

	public List<City> findCityByDistrict(String district);// search city by district

	public void update(City city); // update row in data in a city object

	public void delete(long id); // delete a row from the database
}
