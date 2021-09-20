package com.htc.booking.services;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.booking.entity.Booking;
import com.htc.booking.entity.Centre;


	@Repository
	public interface BookingService extends JpaRepository<Booking,Long>{

	 Collection<Centre> findByPincode(Long pincode);
		
	}


