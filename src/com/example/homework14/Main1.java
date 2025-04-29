package com.example.homework14;

import java.util.List;
import java.util.ArrayList;

public class Main1 {
	public static void main(String[] args) {

		Airline airline1 = new Airline("Rome", 451903, "Boeing-737", 14, 30, "Monday");
		Airline airline2 = new Airline("Milan", 451904, "Boeing-511", 18, 50, "Tuesday");
		Airline airline3 = new Airline("Berlin", 451905, "Boeing-737", 12, 10, "Monday");
		Airline airline4 = new Airline("Rome", 451906, "Boeing-737", 14, 30, "Sunday");
		Airline airline5 = new Airline("Rome", 451907, "Boeing-787", 3, 15, "Wednesday");
		Airline airline6 = new Airline("Milan", 451908, "Boeing-777", 19, 30, "Monday");

		List<Airline> airlines = new ArrayList<Airline>();

		airlines.add(airline1);
		airlines.add(airline2);
		airlines.add(airline3);
		airlines.add(airline4);
		airlines.add(airline5);
		airlines.add(airline6);
		
		Airport airport = new Airport(airlines);
		
		System.out.println(airlines.size());
		
		airport.addAirline(new Airline("Rome", 451909, "Boeing-737", 8, 45, "Friday"));
		
		airlines = airport.getAirlines();
		
		System.out.println(airlines.size());
		
		List<Airline> airlinesByDestination = airport.findAirlinesByDestination("Rome");
		
		airport.printAirlines("Airlines to Rome: ", airlinesByDestination);
		System.out.println(airlinesByDestination.size());
		
		List<Airline> airlinesForDay = airport.findAirlinesForDay("Monday");
		
		airport.printAirlines("Airlines on Monday :", airlinesForDay);
		System.out.println(airlinesForDay.size());
		
		List<Airline> airlinesAfterMinute = airport.findAirlinesAfterTime(14,30,"Monday");
		airport.printAirlines("Airlines on Monday After 13:30 :", airlinesAfterMinute);
		System.out.println(airlinesAfterMinute.size());
		
		 
	}
}
