package com.htc.booking.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking-service")
public class Booking implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2064721711326543962L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookingId;
	private Long centreId;
	private List<Centre> centres;
	private Long pincode;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(Long bookingId, Long centreId, List<Centre> centres, Long pincode) {
		super();
		this.bookingId = bookingId;
		this.centreId = centreId;
		this.centres = centres;
		this.pincode = pincode;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Long getCentreId() {
		return centreId;
	}
	public void setCentreId(Long centreId) {
		this.centreId = centreId;
	}
	public List<Centre> getCentres() {
		return centres;
	}
	public void setCentres(List<Centre> centres) {
		this.centres = centres;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookingId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		return Objects.equals(bookingId, other.bookingId);
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", centreId=" + centreId + ", centres=" + centres + ", pincode="
				+ pincode + "]";
	}
	
	

}
