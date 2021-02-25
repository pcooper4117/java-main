package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDAO;
import com.techelevator.reservations.dao.MemoryHotelDAO;
import com.techelevator.reservations.dao.MemoryReservationDAO;
import com.techelevator.reservations.dao.ReservationDAO;
import com.techelevator.reservations.models.Hotel;
import com.techelevator.reservations.models.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// 	THIS WILL HAND API CALLS DENT TO SERVER WITH PATHS SPICIFIED IN REQUEST
// API HANDLERS == CONTROLERS

// 	TYPICALLY CONTROLLERS FIND THE DATA THE CALLER NEEDS AND RETURNS IT
// USUALLY THE DATA IS RETRIEVED BY THE CONTROLLER USING A DAO OF SOMESORT
@RestController // this tells the controllers to handle specified url paths

// CONTROLLERS ARE PART OF WHAT IS KNOWN AS THE MVC PATTERN
//   MODEL      = DATA FOR APP
//   VIEW       = HOW THE DATA IS DISPLAYEDTO USER
//   CONTROLLER = MEDIATOR BETWEEN MODEL AND VIEW

// IN THIS APP THE MODEL IS HANDLED BY THE DAOS, THE VEIW IS HANDLED BY THE CLIENT CONTROLLER RECIEVE REQUESTS VIA API CALL FROM CLIENT
public class HotelController {
// DEFINE REFERENCES
    private HotelDAO hotelDAO;
    private ReservationDAO reservationDAO;
// CONSTRUCTORS
    public HotelController() {
        this.hotelDAO = new MemoryHotelDAO();
        this.reservationDAO = new MemoryReservationDAO(hotelDAO);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system when a get request with /hotels path is recieved by server
     */
    //@request mapping assign a urel path and http request combination to a method
    @RequestMapping(path = "/hotels", method = RequestMethod.GET) // this method will handle http get urls sent to the server with /hotels path
    public List<Hotel> list() {
    	System.out.println("called with the path /hotels");
        return hotelDAO.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    // data in the url is called path data and is handled with the @pathVariable
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
    	System.out.println("called with the path /hotels/ " +id);

        return hotelDAO.get(id);
    }
// write a controller thats is going to return all of the reservations when we get the path   / eservations
    // we will use the reservation dao find all method to get reservations
    @RequestMapping (path="/reservations", method =RequestMethod.GET)
    public List<Reservation> anyNameYouWant(){
    	System.out.println("Called with the path /Reservations");
		return reservationDAO.findAll();
    	
		// controller using path /hotels/id/reservations - id is the hotelId for the reservation
		// http://localhost8080/hotels/1/reservation - should add a reservation for th hotel whose id =1 
		//data for the new reservation will be in the body of the post request used to call 
		//@request body is going to create an object from the data in the body of the request
		//@pathvariable is going to get the value from the data in the path
    }

		@RequestMapping (path="hotels/{id}/reservations", method=RequestMethod.POST)
		public Reservation Res1(@RequestBody Reservation aReservation // take the data in the request body and instantiate a reservation
				,@PathVariable("id") int hotelId) {		// take id from the path and store it in an int called hotelId
			System.out.println("called with the path /hotels/" + hotelId +  "Reservations");
			
			return reservationDAO.create(aReservation, hotelId);
    }
}
    

