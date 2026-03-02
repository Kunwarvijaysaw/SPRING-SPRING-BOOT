package com.kvs.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kvs.main.entity.HotelReservation;

@Repository
public interface HotelReservationRepository extends CrudRepository<HotelReservation, Long> {

}
