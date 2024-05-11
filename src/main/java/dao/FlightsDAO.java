package dao;

import model.Flight;

import java.util.Collection;
import java.util.List;

public interface FlightsDAO {
    Flight getFlightById(int id);

    void deleteFlight(Flight flight);

    void saveFlight(Flight flight);

    Collection<Flight> getAllFlights();

    boolean existById(Flight flight);

}
