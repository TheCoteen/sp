package dao;

import model.Flight;

import java.util.List;

public interface FlightsDAO {
    Flight getFlightById(int id);

    List<Flight> getAllFlights();

}
