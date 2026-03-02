package com.kvs.main.service;

import java.util.Optional;

import com.kvs.main.entity.Travel;

public interface ITravelService {
	
	// Adds a new travel booking.
	void addTravel(Travel travel);
	
	
	// Retrieves all travel bookings.
	Iterable<Travel> getAllTravels();
	
	// Finds a travel booking by ID.
	Optional<Travel> findTravelById(Long id); 
	
	
	// Deletes a travel booking by ID.
	void deleteTravelById(Long id); 
	
	// Checks if a travel booking exists by ID.
	boolean existsById(Long id); 
	
	
	// Returns the total number of travel bookings.
	long count(); 
	
	// Deletes a specific travel booking object.
	void delete(Travel travel); 
	
	
	// Deletes all travel bookings.
	void deleteAll();


}
