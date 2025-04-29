package com.example.homework14;

import java.util.Objects;

public class Airline {
	private String destination;
	private int flightNumber;
	private String airplaneType;
	private int departureHour;
	private int departureMinute;
	private String dayOfWeek;
	
	public Airline() {
		
	}
	
	public Airline(String destination, int flightNumber) {
		this.destination = destination;
		this.flightNumber = flightNumber;
	}
	
	public Airline(String destination, int flightNumber,
				   String airplaneType,int departureHour, int departureMinute, String dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		this.departureHour = departureHour;
		this.departureMinute = departureMinute;
		this.dayOfWeek = dayOfWeek;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getDestination() {
		return destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public int getDepartureHour() {
		return departureHour;
	}

	public void setDepartureHour(int departureHour) {
		this.departureHour = departureHour;
	}

	public int getDepartureMinute() {
		return departureMinute;
	}

	public void setDepartureMinute(int departureMinute) {
		this.departureMinute = departureMinute;
	}

	@Override
	public int hashCode() {
		return Objects.hash(airplaneType, dayOfWeek, departureHour, departureMinute, destination, flightNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(airplaneType, other.airplaneType) && Objects.equals(dayOfWeek, other.dayOfWeek)
				&& Objects.equals(departureHour, other.departureHour)
				&& Objects.equals(departureMinute, other.departureMinute)
				&& Objects.equals(destination, other.destination) && flightNumber == other.flightNumber;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", airplaneType="
				+ airplaneType + ", departureHour=" + departureHour + ", departureMinute=" + departureMinute
				+ ", dayOfWeek=" + dayOfWeek + "]";
	}
	
	
}
