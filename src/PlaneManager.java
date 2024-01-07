import java.util.ArrayList;
import java.util.List;
public class PlaneManager {
    private List<Plane> planes;
    private Directory directory;

    public PlaneManager(String subdirectory, String filename) {
        this.directory = new Directory(subdirectory);
        this.planes = readPlanesFromFile(filename);
    }

    // Method to read the file and store the data in a list
    private List<Plane> readPlanesFromFile(String filename) {
        List<Plane> planes = new ArrayList<>();
        String content = directory.readFromFile(filename);
        String[] lines = content.split("\n");
        for (String line : lines) {
            String[] values = line.split(",");
            String companyName = values[0];
            String boingNumber = values[1];
            String startFrom = values[2];
            String destination = values[3];
            String departureTime = values[4];
            List<Coach> coaches = new ArrayList<>();
            for (int i = 5; i < values.length; i++) {
                String[] coachValues = values[i].split(":");
                String coachType = coachValues[0];
                int seatCapacity = Integer.parseInt(coachValues[1]);
                double fare = Double.parseDouble(coachValues[2]);
                coaches.add(new Coach(coachType, seatCapacity, fare));
            }
            planes.add(new Plane(companyName, boingNumber, startFrom, destination, departureTime, coaches));
        }
        return planes;
    }

    // Method to search planes by startFrom and destination
    public List<Plane> searchPlanes(String startFrom, String destination) {
        List<Plane> result = new ArrayList<>();
        for (Plane plane : this.planes) {
            if (plane.getStartFrom().equals(startFrom) && plane.getDestination().equals(destination)) {
                result.add(plane);
            }
        }
        return result;
    }
}
