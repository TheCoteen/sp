package service;

import dao.FlightsDAO;
import model.Flight;

import java.time.LocalDateTime;
import java.util.Map;

public class FlightsService {
    FlightsDAO flightsDAO;

    public FlightsService(FlightsDAO flightsDAO) {
        this.flightsDAO = flightsDAO;
    }

    public void displayOnlineBoard(){
        System.out.println("Displaying flights within the next 24 hours :");

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime next24hours = now.plusHours(24);
        boolean flightFound = false;

        for (Flight flight : flightsDAO.getAllFlights()){
            if(flight.getOrigin().equals("Kiev") && flight.getDepartureTime().isAfter(now) && flight.getDepartureTime().isBefore(next24hours)){
                System.out.println("Flight ID: " + flight.getId());
                System.out.println("Origin: " + flight.getOrigin());
                System.out.println("Destination: " + flight.getDestination());
                System.out.println("Departure Time: " + flight.getDepartureTime());
                System.out.println("Available Seats: " + flight.getAvailableSeats());
                flightFound = true;
            }
        }

        if(!flightFound){
            System.out.println("There are no flights found within next 24 hours from Kiev");
        }

    }


    public void getFlightInfo(int id){


    }

    public void searchFlight(String destination, LocalDateTime date, int numOfPeople){

    }

    public void bookFlight(int id, Map<String, String> namesAndSurnames){

    }




}
