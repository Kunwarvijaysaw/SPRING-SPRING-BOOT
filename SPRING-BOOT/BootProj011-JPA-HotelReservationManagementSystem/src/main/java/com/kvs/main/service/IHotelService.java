package com.kvs.main.service;

import java.util.Optional;

import com.kvs.main.entity.HotelReservation;

public interface IHotelService {
	
	HotelReservation addReservation(HotelReservation reservation);
	Iterable<HotelReservation> getAllReservations();
	Optional<HotelReservation> findReservationById(Long id);

}
