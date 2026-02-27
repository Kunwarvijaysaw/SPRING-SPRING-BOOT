package com.kvs.main.service;

import java.util.Optional;

import com.kvs.main.entity.Travel;

public interface ITravelService {
	
	Travel TraveladdTravel(Travel travel);
	 Iterable<Travel> retrieveAllTravels();
	Optional<Travel> findTravelById(Long id);

}
