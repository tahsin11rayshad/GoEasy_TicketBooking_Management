import java.util.ArrayList;
import java.util.List;

public class ShipManager {
    private List<Ship> ships;
    private Directory directory;

    public ShipManager(String subdirectory, String filename) {
        this.directory = new Directory(subdirectory);
        this.ships = readShipsFromFile(filename);
    }

    // Method to read the file and store the data in a list
    private List<Ship> readShipsFromFile(String filename) {
        List<Ship> ships = new ArrayList<>();
        String content = directory.readFromFile(filename);
        String[] lines = content.split("\n");
        for (String line : lines) {
            String[] values = line.split(",");
            String companyName = values[0];
            String shipName = values[1];
            int shipNumber = Integer.parseInt(values[2]);
            String startFrom = values[3];
            String destination = values[4];
            String departureTime = values[5];
            List<Coach> coaches = new ArrayList<>();
            for (int i = 6; i < values.length; i++) {
                String[] coachValues = values[i].split(":");
                String coachType = coachValues[0];
                int seatCapacity = Integer.parseInt(coachValues[1]);
                double fare = Double.parseDouble(coachValues[2]);
                coaches.add(new Coach(coachType, seatCapacity, fare));
            }
            ships.add(new Ship(companyName, shipName, shipNumber, startFrom, destination, departureTime, coaches));
        }
        return ships;
    }

    // Method to search ships by startFrom and destination
    public List<Ship> searchShips(String startFrom, String destination) {
        List<Ship> result = new ArrayList<>();
        for (Ship ship : this.ships) {
            if (ship.getStartFrom().equals(startFrom) && ship.getDestination().equals(destination)) {
                result.add(ship);
            }
        }
        return result;
    }
}
