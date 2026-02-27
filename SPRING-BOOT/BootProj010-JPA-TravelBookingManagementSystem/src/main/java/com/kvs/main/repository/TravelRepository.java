package com.kvs.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kvs.main.entity.Travel;
@Repository
public interface TravelRepository extends CrudRepository<Travel,Long>{

	

}
