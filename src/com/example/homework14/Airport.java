package com.example.homework14;

import java.util.List;
import java.util.ArrayList;

public class Airport {
	List<Airline> airlines;
	
	public Airport() {
		airlines = new ArrayList<Airline>();
	}
	
	public Airport(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	public List<Airline> getAirlines(){
		return airlines;
	}
	
	public boolean addAirline(Airline airline) {
		return airlines.add(airline);
	}
	
	public boolean deleteAirline(Airline airline) {
		return airlines.remove(airline);
	}
	
	public List<Airline> findAirlinesByDestination(String destination){
		
		List<Airline> airlinesByDestination = new ArrayList<Airline>();
		
		for(Airline currentAirline: this.airlines) {
			if(currentAirline.getDestination().equals(destination)) {
				airlinesByDestination.add(currentAirline);
			}
		}
		return airlinesByDestination;
	}
	
	public List<Airline> findAirlinesForDay(String dayOfWeek){
		List<Airline> airlinesForDay = new ArrayList<Airline>();
		for(Airline currentAirline: airlines) {
			if(currentAirline.getDayOfWeek().equals(dayOfWeek)) {
				airlinesForDay.add(currentAirline);
			}
		}
		return airlinesForDay;
	}
	
	public List<Airline> findAirlinesAfterTime(int departureHour, int departureMinute, String day){
		List<Airline> AirlinesAfterTime = new ArrayList<Airline>();
		
		for(Airline currentAirline: airlines) {
			if(currentAirline.getDayOfWeek().equals(day)) {
				if(currentAirline.getDepartureHour() > departureHour) {
					AirlinesAfterTime.add(currentAirline);
				} else if(currentAirline.getDepartureHour() == departureHour) {
					if(currentAirline.getDepartureMinute() > departureMinute) {
						AirlinesAfterTime.add(currentAirline);
					}
				}
			}
		}
		return AirlinesAfterTime;
	}
	
	public void printAirlines(String message, List<Airline> airlines) {
		
		System.out.println(message);
		for(Airline airline: airlines) {
			System.out.println(airline);
		}
	}
	
	
	

}
