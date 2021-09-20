package com.htc.booking.services;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.booking.entity.Centre;


@Repository
public interface ICentre extends JpaRepository<Centre,Long>{

 Collection<Centre> findByPincode(Long pincode);
	
}
