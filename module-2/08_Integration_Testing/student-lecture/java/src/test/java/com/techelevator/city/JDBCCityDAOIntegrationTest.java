package com.techelevator.city;
//
//
//
// Integration testing -  is testing to ensure your code interacts with external processes correctly
// you want to be sure that your code doesn't break when working with external code
// unit test ensures that your class methods work as intended within the context of the  program

// when using DAOs we are interacting with external resouces, process called database manager
// We will use Junit with additional techniques and methods

// We need to verify and insert update or delete was done correctly 

// We can use the DAO interface to determine which methods we need to test, they interact with database

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JDBCCityDAOIntegrationTest {
	// define data with values you know will not and cannot be in the database for testing

	private static final String TEST_COUNTRY = "XYZ"; // we know there is no country code named xyz
	
	// when we need a country code for a test well use this constant

	/* Using this particular implementation of DataSource so that
	 * every database interaction is part of the same database
	 * previously we used a basic data source
	 * we use Single Connection data source due to its efficiencies over the basic data souces
	 * and give example of another data source
	 * 
	 * session and hence the same database transaction
	 * 
	 *  Both data source have the same constructor format  and methods
	 *  */
	private static SingleConnectionDataSource dataSource; // define a reference to the data souce
				// the data source object is instantiated in a set up method
	private JDBCCityDAO dao;// define reference to DAO

	/* Before any tests are run, this method initializes the datasource for testing. */
	@BeforeClass // tells junit to do this once before anything else
				// put setup that all tests need to be done before start
	public static void setupDataSource() {   // name of junit test method
		dataSource = new SingleConnectionDataSource();  // instantiating 
		dataSource.setUrl("jdbc:postgresql://localhost:5432/world"); // set connection string
		dataSource.setUsername("postgres"); // set database owner
		dataSource.setPassword("postgres1"); // set password 
		/* The following line disables autocommit for connections
		 * returned by this DataSource. This allows us to rollback
		 * any changes after each test */
		dataSource.setAutoCommit(false);  // tells data source not to automaticcly commit after each interaction because we want controll of it
	}

	/* After all tests have finished running, this method will close the DataSource */
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}
	
	// Do not use live data in the data base for your tests - it may change between tests
	// test must be reliable 
	// Add data to the database specifically for the tests so you know data is there
	// add data with values you know are not or cannot be in the database already
	// rollback any test data you added when the test completes

	@Before // do this before every junit test
	public void setup() {
		String sqlInsertCountry = "INSERT INTO country (code, name, continent, region, surfacearea, indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, capital, code2) VALUES (?, 'Afghanistan', 'Asia', 'Southern and Central Asia', 652090, 1919, 22720000, 45.9000015, 5976.00, NULL, 'Afganistan/Afqanestan', 'Islamic Emirate', 'Mohammad Omar', 1, 'AF')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertCountry, TEST_COUNTRY);
		// instantiate a new object for DAO containing the methods
		// we do this before each test so we get a clean unused jdbc/DAO object for each test
		// so no remnants of prior test remain in the jdbc/dao, if we shared the DAO instance it may produce different results
		
		dao = new JDBCCityDAO(dataSource);
	}

	/* After each test, we rollback any changes that were made to the database so that
	 * everything is clean for the next test */
	@After   // tells junit to do at end 
			// ussually this is where you disconnect to avoid resource leak
	public void rollback() throws SQLException {  // rollback any data added for the tests
		dataSource.getConnection().rollback();
	}

	// this is the start of our testing
	// 
	
	@Test // test the save method 
	public void save_new_city_and_read_it_back() throws SQLException {
		// arrange - set up data needed for the test
		City theCity = getCity("SQL Station", "South Dakota", "USA", 65535); // instantiate a city object using common method
								// defined near the end of testing class
		// ACT - PERFROM THE PROCESS/CALL THE METHOD WE ARE TESTING
		dao.save(theCity); // CALL THE CITY DAO SAVE METHOD WITH THE NEW CITY OBJECT WE CREATED FOR TEST
		// VERIFY THE METHOD OR PROCESS DID WHAT IT WAS SUPPOSED TO 
		City savedCity = dao.findCityById(theCity.getId()); // GET THE ROW JUST ADDED TO DATABASE WITH ID IN THE OBJECT USED TO TEST OBJECT

		assertNotEquals(null, theCity.getId()); // BE SURE THE ID ADDED WAS NOT NULL
		assertCitiesAreEqual(theCity, savedCity); // BE SURE THE DATA RETRIEVED FROM THE DATA BASE MATCHES WHAT WE SENT 
	}

	@Test // CAN WE FIND A CITY BY COUNTRY CODE?
	public void returns_cities_by_country_code() {
		// ARANGE  SET UP DATA
		City theCity = getCity("SQL Station", "South Dakota", TEST_COUNTRY, 65535);
//		INSTANTIATE A CITY USING COUNTRY CODE, THAT WAY WE KNOW ITS THE ONLY CITY
		// SAVE THE TEST CITY TO DATA BASE
		dao.save(theCity);
		// ACT - PERFORM THE PROCESS OR CALL METHOD WE ARE TESTING
		// TRY TO GET ALL THE CITIES WITH THE TEST COUNTRY CODE
		List<City> results = dao.findCityByCountryCode(TEST_COUNTRY);
// 			ASSERT 
		assertNotNull(results);  // VERIFY THAT SOMTHING WAS RETURNED 
		assertEquals(1, results.size()); /// VERIFY THAT ONE CITY WAS RETURNED 
		City savedCity = results.get(0); // GET THE CITY OUT OF THE LIST THAT WAS RETURNED
		assertCitiesAreEqual(theCity, savedCity); // AND BE SURE IT MATCHES THE CITY WE SENT 
	}

	@Test
	public void returns_multiple_cities_by_country_code() {
// ARRANGE 
		// INSTANTIATE MULTIPLE NEW CITIES WITH THE TEST COUNTRY- THEY WILL BE ONLY ONES IN THE TABLE WITH THE TEST CODE
		// AND ADD THEM TO DATA BASE
		dao.save(getCity("SQL Station", "South Dakota", TEST_COUNTRY, 65535));
		dao.save(getCity("Postgres Point", "North Dakota", TEST_COUNTRY, 65535));
// ACT 		GET ALL THE CITIES WITH THE TEST COUNTRY CODE - WE KNOW THERE SHOULD ONLY BE TWO
		List<City> results = dao.findCityByCountryCode(TEST_COUNTRY);
// ASSERT 		DID AT LEAST ONE CITY GET RETURNED/ DID EXACTLY TWO CITIES GET RETURNED
		assertNotNull(results); 
		assertEquals(2, results.size());
		

	}

	@Test
	public void returns_cities_by_district() {
		String testDistrict = "Tech Elevator";
		City theCity = getCity("SQL Station", testDistrict, TEST_COUNTRY, 65535);
		dao.save(theCity);

		List<City> results = dao.findCityByDistrict(testDistrict);

		assertNotNull(results);
		assertEquals(1, results.size());
		City savedCity = results.get(0);
		assertCitiesAreEqual(theCity, savedCity);
	}

	
	// HELPER METHODS USED TO SETUP DATA FOR THE TEST, COMMONLY NEEDED PROCESSES
	// HELPER METHOD TO CREATE NEW CITY OBJECT 
	// THESE METHODS ARENT TESTING AND DAO METHODS THEY ARE HELPING THE TEST 
	private City getCity(String name, String district, String countryCode, int population) {
		City theCity = new City();
		theCity.setName(name);
		theCity.setDistrict(district);
		theCity.setCountryCode(countryCode);
		theCity.setPopulation(population);
		return theCity;
	}

	private void assertCitiesAreEqual(City expected, City actual) {
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getName(), actual.getName());
		assertEquals(expected.getDistrict(), actual.getDistrict());
		assertEquals(expected.getCountryCode(), actual.getCountryCode());
		assertEquals(expected.getPopulation(), actual.getPopulation());
	}
}
