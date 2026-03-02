package com.kvs.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.HotelReservation;
import com.kvs.main.repository.HotelReservationRepository;

@Service
public class HotelService implements IHotelService {
	
	@Autowired
	private HotelReservationRepository hotelReservationRepository;

	@Override
	public HotelReservation addReservation(HotelReservation reservation) {
		
		return hotelReservationRepository.save(reservation);
	}

	@Override
	public Iterable<HotelReservation> getAllReservations() {
		
		return hotelReservationRepository.findAll();
	}

	@Override
	public Optional<HotelReservation> findReservationById(Long id) {
		// TODO Auto-generated method stub
		return hotelReservationRepository.findById(id);
	}

	

}
