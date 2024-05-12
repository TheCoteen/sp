import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import console.ConsoleApp;
import controller.BookingController;
import controller.FlightsController;
import dao.*;
import model.Booking;
import model.BookingDTO;
import model.Flight;
import model.FlightDTO;
import service.BookingService;
import service.FlightsService;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;

public class FlightApp {
    public static void main(String[] args) {

        FlightsDAO flightsDAO = new FlightDAOInFile(new ObjectMapper().registerModule(new JavaTimeModule()));
        FlightsService flightsService = new FlightsService(flightsDAO);
        FlightsController flightsController = new FlightsController(flightsService);


        BookingDAO bookingDAO = new BookingDAOInFile(new ObjectMapper().registerModule(new JavaTimeModule()));
        BookingService bookingService = new BookingService(bookingDAO);
        BookingController bookingController = new BookingController(bookingService);

        ConsoleApp consoleApp = new ConsoleApp(flightsController, bookingController);
        consoleApp.start();



    }
}
