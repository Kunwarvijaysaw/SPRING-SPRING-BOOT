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

	public Travel TraveladdTravel(Travel travel) {
		return iTravelService.TraveladdTravel(travel);
	}

	public Iterable<Travel> retrieveAllTravels() {
		return iTravelService.retrieveAllTravels();
	}

	public Optional<Travel> findTravelById(Long id) {
		return iTravelService.findTravelById(id);
	}

}
