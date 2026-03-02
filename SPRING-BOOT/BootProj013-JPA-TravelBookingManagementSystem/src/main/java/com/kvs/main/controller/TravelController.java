package com.kvs.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kvs.main.entity.Travel;
import com.kvs.main.service.ITravelService;
@Controller
public class TravelController {
	
	@Autowired
	private ITravelService iTravelService;
	
	// Prompts the user for travel details and saves the booking.
	public void addTravel(Travel travel){
		iTravelService.addTravel(travel);
	}
	
	//Lists all travel bookings.
	public Iterable<Travel> retrieveAllTravels(){ 
		return iTravelService.getAllTravels();
	}
	
	//: Finds and displays a travel booking by its ID.
	public void findTravelById(Long id){
		Optional<Travel> travelById = iTravelService.findTravelById(id);
		System.out.println(travelById);
	}
	//: Deletes a travel booking by ID.
	public void deleteTravelById(Long id){
		iTravelService.deleteTravelById(id);
	}
	
	//: Checks if a travel booking exists.
	public void checkIfTravelExists(Long id){
		iTravelService.existsById(id);
	}
	//: Retrieves the total number of travel bookings.
	public void countTravels(){
		iTravelService.count();
	}
	
	//: Deletes a specific travel booking.
	public void deleteTravelObject(Travel travel){
		iTravelService.delete(travel);
	}
	
	//: Deletes all travel bookings.
	public void deleteAllTravels(){
		iTravelService.deleteAll();
		
		
	}


}
