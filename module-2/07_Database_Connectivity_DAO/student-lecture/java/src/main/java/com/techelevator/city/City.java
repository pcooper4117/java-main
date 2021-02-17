package com.techelevator.city;
// 	CLASS SHOULD HAVE SAME NAME AS TABLE
// ALTHOUGH NOT REQUIRED VARIABLE NAMES IN POJO SHOULD MATCH COLUMN NAMES

public class City {
	private Long 	 id;				//serial
	private String	 name;				// varchar
	private String	 countryCode;		//bpchar
	private String	 district;			// varchar
	private int 	 population;		// int4 (integer)
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
