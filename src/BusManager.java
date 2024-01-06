import java.util.ArrayList;
import java.util.List;

public class BusManager {
    private List<Bus> buses;
    private Directory directory;

    public BusManager(String subdirectory, String filename) {
        this.directory = new Directory(subdirectory);
        this.buses = readBusesFromFile(filename);
    }

    // Method to read the file and store the data in a list
    private List<Bus> readBusesFromFile(String filename) {
        List<Bus> buses = new ArrayList<>();
        String content = directory.readFromFile(filename);
        String[] lines = content.split("\n");
        for (String line : lines) {
            String[] values = line.split(",");
            String busNumber = values[0];
            String companyName = values[1];
            String startFrom = values[2];
            String destination = values[3];
            String departureTime = values[4];
            double fare = Double.parseDouble(values[5]);
            int seatCapacity = Integer.parseInt(values[6]);
            String busType = values[7];
            buses.add(new Bus(companyName, busNumber, busType, startFrom, destination, departureTime, fare, seatCapacity));
        }
        return buses;
    }

    // Method to search buses by startFrom and destination
    public List<Bus> searchBuses(String startFrom, String destination) {
        List<Bus> result = new ArrayList<>();
        for (Bus bus : this.buses) {
            if (bus.getStartFrom().equals(startFrom) && bus.getDestination().equals(destination)) {
                result.add(bus);
            }
        }
        return result;
    }
}
