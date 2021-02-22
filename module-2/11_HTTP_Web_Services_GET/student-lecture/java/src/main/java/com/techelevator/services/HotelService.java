package com.techelevator.services;

import com.techelevator.models.City;
import com.techelevator.models.Hotel;
import com.techelevator.models.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private final String API_BASE_URL;
    private RestTemplate callAPI = new RestTemplate();

    public HotelService(String apiURL) {
        API_BASE_URL = apiURL;
    }

    public Hotel[] listHotels() {
    	
        return callAPI.getForObject(API_BASE_URL + "hotels", Hotel[].class);
    }

    public Review[] listReviews() {
    	 return callAPI.getForObject(API_BASE_URL + "review", Review[].class);
       
    }

    public Hotel getHotelById(int id) {
    return callAPI.getForObject(API_BASE_URL + "hotels/"+id, Hotel.class);
    }

    public Review[] getReviewsByHotelId(int hotelID) {
        return null;
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        return null;
    }

    public City getWithCustomQuery(){
        return null;
    }

}
