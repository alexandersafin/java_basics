import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        double allFlight = airport.getAllAircrafts().size();
        System.out.println("Количество самолетов: " + allFlight);
    }
}
