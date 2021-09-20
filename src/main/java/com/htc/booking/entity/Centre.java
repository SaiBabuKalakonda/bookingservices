package com.htc.booking.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="centre-service")
public class Centre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2297775184120924963L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long centreId;
	private String centreName;
	private String centreAddress;
	private Long pincode;
	private LocalDate vaccinationDate;
	public Centre() {
		super();
		
	}
	public Centre(String centreName, String centreAddress, Long pincode, LocalDate vaccinationDate) {
		super();
		this.centreName = centreName;
		this.centreAddress = centreAddress;
		this.pincode = pincode;
		this.vaccinationDate = vaccinationDate;
	}
	public Long getCentreId() {
		return centreId;
	}
	public void setCentreId(Long centreId) {
		this.centreId = centreId;
	}
	public String getCentreName() {
		return centreName;
	}
	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}
	public String getCentreAddress() {
		return centreAddress;
	}
	public void setCentreAddress(String centreAddress) {
		this.centreAddress = centreAddress;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public LocalDate getVaccinationDate() {
		return vaccinationDate;
	}
	public void setVaccinationDate(LocalDate vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(centreId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Centre other = (Centre) obj;
		return Objects.equals(centreId, other.centreId);
	}
	@Override
	public String toString() {
		return "Centre [centreId=" + centreId + ", centreName=" + centreName + ", centreAddress=" + centreAddress
				+ ", pincode=" + pincode + ", vaccinationDate=" + vaccinationDate + "]";
	}

}
