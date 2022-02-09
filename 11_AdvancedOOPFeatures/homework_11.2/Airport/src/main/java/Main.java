import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        airport.getAllAircrafts();
        findPlanesLeavingInTheNextTwoHours(airport);
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        LocalDateTime currentTime = LocalDateTime.now();
        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream())
                .filter(flight ->  flight.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().isBefore(currentTime.plusHours(2)))
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE)
                .collect(Collectors.toList());
    }
}