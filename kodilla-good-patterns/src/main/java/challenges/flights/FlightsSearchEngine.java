package challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearchEngine {

    private FlightsRoutes flightSet;
    //TODO
    //private static Set<Flight> flightSet = new HashSet<>();
    //w konstruktor FligsSearchEngine

    //takes all routes and makes list of only those with departure city
    //makes FlightRoutes class a stream
    //filters and compares
    public static List<Flight> flightsFromCity(City departureCity) {
        return FlightsRoutes.getFlightSet().stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .collect(Collectors.toList());
    }

    //takes all routes and makes list of only those with arrival city
    public static List<Flight> flightsToCity(City arrivalCity) {
        return FlightsRoutes.getFlightSet().stream()
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
    }

    //takes from set only those that == departere and arrival
    //filters and returns
    public static List<Flight> flightDirectly(City departureCity, City arrivalCity) {
        return FlightsRoutes.getFlightSet().stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity) && flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
    }

    //najpierw sprawdzamy gdzie może być przesiadka wybierając lot z np. z Poznania do Warszaw i
    //robi listę w jakich miastach może być przesiadka
    public static List<Flight> flightWithTransfer(City departureCity, City arrivalCity) {
        List<Flight> transferFly = FlightsSearchEngine.flightsFromCity(departureCity);
        List<City> transferFlyArrival = transferFly.stream()
                .map(flight -> flight.getArrivalCity())
                .collect(Collectors.toList());

        //następnie sprawdza, czy z tych miast, które wyłoniliśmy w poprzedniej metodzie można
        // (contain) dolecieć do departure city
        List<Flight> result = FlightsSearchEngine.flightsToCity(arrivalCity);
        return result.stream()
                .filter(flight -> transferFlyArrival.contains(flight.getDepartureCity()))
                .collect(Collectors.toList());
    }
}

