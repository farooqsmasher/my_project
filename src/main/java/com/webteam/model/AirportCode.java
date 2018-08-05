package com.webteam.model;

import java.io.Serializable;
import javax.persistence.*;
/**
 * The persistent class for the AIRPORT_CODE database table.
 * 
 */
@Entity
@Table(name="AIRPORT_CODE")
public class AirportCode implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1605606502474807415L;

	@Id
	@SequenceGenerator(name="AIRPORT_CODE_ID_GENERATOR", sequenceName="AIRPORT_CODE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AIRPORT_CODE_ID_GENERATOR")
	private Long id;

	@Column(name="AIRPORT_CITY")
	private String airportCity;

	@Column(name="AIRPORT_ID")
	private String airportId;

	@Column(name="AIRPORT_NAME")
	private String airportName;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

	public AirportCode() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAirportCity() {
		return this.airportCity;
	}

	public void setAirportCity(String airportCity) {
		this.airportCity = airportCity;
	}

	public String getAirportId() {
		return this.airportId;
	}

	public void setAirportId(String airportId) {
		this.airportId = airportId;
	}

	public String getAirportName() {
		return this.airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}