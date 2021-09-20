package com.htc.booking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.booking.entity.Booking;
import com.htc.booking.entity.Centre;
import com.htc.booking.services.BookingService;
import com.htc.booking.services.ICentre;



@RestController
@RequestMapping("/api")
public class BookingController {
	
	@Autowired
	private ICentre centreRepository;
	@Autowired
	private BookingService bookingService;
 
@GetMapping("/centre/{centreId}")
Centre getCentre(@PathVariable Long centreId)
{
	Centre centre=null;
	centre=centreRepository.findById(centreId).get();
	return centre;
	
}

@GetMapping("/booking/{bookingId}")
Booking getBooking(@PathVariable Long bookingId)
{
	Booking booking=null;
	booking=bookingService.findById(bookingId).get();
	return booking;
	
}

@GetMapping("/centres/{pincode}")
Centre getCentres(@PathVariable Long pincode)
{
	Centre centre=null;
	centre=(Centre) centreRepository.findByPincode(pincode);
	return centre;
	
}


@GetMapping("/centres")
public List<Centre> getAllCentres() {
 
  List<Centre> list = new ArrayList<>();
  Iterable<Centre> customers = centreRepository.findAll();

  customers.forEach(list::add);
  return list;
	
}

@PostMapping("/centres")
Centre createEmployee(@RequestBody Centre centre)

{
	
	return centreRepository.save(centre);
	
}
@PutMapping("/centre")
private Centre update(@RequestBody Centre centre)   
{  
centre=centreRepository.saveAndFlush(centre);  
return centre;  
}  

@DeleteMapping("/centre/{centreId}")
void deletePatient(@PathVariable Long centreId)
{
	centreRepository.deleteById(centreId);
	
}

@PostMapping("/booking")
Booking createBooking(@RequestBody Booking booking)

{
	
	return bookingService.save(booking);
	
}

}


