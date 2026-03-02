package com.kvs.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Travel;
import com.kvs.main.repository.TravelRepository;

@Service
public class TravelService implements ITravelService {
	
	@Autowired
	TravelRepository travelRepository;
	
	@Override
	public void addTravel(Travel travel) {
	Travel save = travelRepository.save(travel);
	if(save!= null) {
		System.out.println("Data inserted!!!");
	}else {
	System.out.println("Data not inserted!!!");
	}
		
	}

	@Override
	public Iterable<Travel> getAllTravels() {
		return travelRepository.findAll();
		
	}

	@Override
	public Optional<Travel> findTravelById(Long id) {
		
		return travelRepository.findById(id);
	}

	@Override
	public void deleteTravelById(Long id) {
		travelRepository.deleteById(id);
		
	}

	@Override
	public boolean existsById(Long id) {
		
		return travelRepository.existsById(id);
	}

	@Override
	public long count() {
		
		return travelRepository.count();
	}

	@Override
	public void delete(Travel travel) {
		travelRepository.delete(travel);
		
	}

	@Override
	public void deleteAll() {
		travelRepository.deleteAll();
	}

}
