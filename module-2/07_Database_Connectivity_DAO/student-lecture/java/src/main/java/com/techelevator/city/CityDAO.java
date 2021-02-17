// DAO INTERFACE FOR THE CITY TABLE FOR THE WORLD DATABASE
// LIKE EVERY OTHER INTERFACE IT IDENTIFIES METHODS THAT MUST BE IMPLEMENTED IN ORDER TO USE
// TYPICALLY CRUD PROCESS ARE REQUIRED METHODS FOR SPRING DAO
// OTHER METHODS MAY ALSO BE REQUIRED 
//
//

package com.techelevator.city;

import java.util.List;

public interface CityDAO {

	public void save(City newCity);   	// ADD/CREATE ROW TO THE TABLE USING AN OBJECT
	// ONE OR MORE SEARCH METHODS TO RETRIEVE DATA
	public City findCityById(long id);	
	public List<City> findCityByCountryCode(String countryCode);
	public List<City> findCityByDistrict(String district);
	public void update(City city);	// UPDATE A ROW USING AN OBJECT OF THE CLASS
	public void delete(long id);		// DELETE ROW USING ID PASSED IN
										// PARAMETER IS USUALLY THE COLUMN IN PRIMARY
}
