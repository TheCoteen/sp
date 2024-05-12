package controller;

import model.Flight;
import model.FlightDTO;
import service.FlightsService;

public class FlightsController {
    FlightsService flightsService;

    public FlightsController(FlightsService flightsService) {
        this.flightsService = flightsService;
    }

    public FlightDTO createFlight(FlightDTO flightDTO){
        return flightsService.createFlight(flightDTO);
    }

    public void displayOnlineBoard(){
        flightsService.displayOnlineBoard();
    }

    public FlightDTO showFlightInfo(){
        return flightsService.getFlightInfo();
    }

    public FlightDTO searchFlight(){
        return flightsService.searchFlight();
    }

    public void printFlight(Flight f){flightsService.printFlight(f);}
}
