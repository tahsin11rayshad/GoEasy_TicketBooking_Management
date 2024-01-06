import java.util.ArrayList;
import java.util.List;

public class TrainManager {
    private List<Train> trains;
    private Directory directory;

    public TrainManager(String subdirectory, String filename) {
        this.directory = new Directory(subdirectory);
        this.trains = readTrainsFromFile(filename);
    }

    // Method to read the file and store the data in a list
    private List<Train> readTrainsFromFile(String filename) {
        List<Train> trains = new ArrayList<>();
        String content = directory.readFromFile(filename);
        String[] lines = content.split("\n");
        for (String line : lines) {
            String[] values = line.split(",");
            String trainNumber = values[0];
            String trainName = values[1];
            String startFrom = values[2];
            String destination = values[3];
            String departureTime = values[4];
            List<Coach> coaches = new ArrayList<>();
            for (int i = 5; i < values.length; i++) {
                String[] coachValues = values[i].split(":");
                String coachType = coachValues[i];
                int seatCapacity = Integer.parseInt(coachValues[i+1]);
                double fare = Double.parseDouble(coachValues[i+2]);
                coaches.add(new Coach(coachType, seatCapacity, fare));
            }
            trains.add(new Train(trainNumber, trainName, startFrom, destination, departureTime, coaches));
        }
        return trains;
    }

    // Method to search trains by startFrom and destination
    public List<Train> searchTrains(String startFrom, String destination) {
        List<Train> result = new ArrayList<>();
        for (Train train : this.trains) {
            if (train.getStartFrom().equals(startFrom) && train.getDestination().equals(destination)) {
                result.add(train);
            }
        }
        return result;
    }
}
