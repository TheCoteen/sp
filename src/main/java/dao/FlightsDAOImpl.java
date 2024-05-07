package dao;

import model.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsDAOImpl implements FlightsDAO {
    List<Flight> flights = new ArrayList<>();

    @Override
    public Flight getFlightById(int id) {
        return flights.stream().filter(i->i.getId()==id).collect(Collectors.toList()).get(0);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flights;
    }
}
