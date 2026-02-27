package com.kvs.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Travel;
import com.kvs.main.repository.TravelRepository;

@Service
public class TravelService implements ITravelService {

	@Autowired
	private TravelRepository travelRepository;

	@Override
	public Travel TraveladdTravel(Travel travel) {
		return travelRepository.save(travel);
	}

	@Override
	public Iterable<Travel> retrieveAllTravels() {
		return travelRepository.findAll();
	}

	@Override
	public Optional<Travel> findTravelById(Long id) {
		return travelRepository.findById(id);
	}

}
