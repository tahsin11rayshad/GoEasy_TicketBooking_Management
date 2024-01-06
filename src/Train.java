import java.io.IOException;
import java.util.List;

public class Train implements IVehicle{
    private int trainNumber;
    private String trainName;
    private String startFrom;
    private String destination;
    private String departureTime;
    private List<Coach> coaches;
    private Directory directory;

    public Train(int trainNumber, String trainName, String startFrom, String destination, String departureTime, List<Coach> coaches, Directory directory) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.startFrom = startFrom;
        this.destination = destination;
        this.departureTime = departureTime;
        this.coaches = coaches;
        this.directory = directory;
    }

    public void registerVehicle() {
        directory.createDirectory();

        StringBuilder allTrainsContent = new StringBuilder(this.trainNumber + "," + this.trainName + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "\n");
        for (Coach coach : coaches) {
            allTrainsContent.append(coach.getCoachType()).append(":").append(coach.getSeatCapacity()).append(":").append(coach.getFare()).append(",");
        }
        allTrainsContent.append("\n");
        directory.writeToFile("alltrains.txt", allTrainsContent.toString(), true);

        StringBuilder companyContent = new StringBuilder(this.trainName + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "\n");
        for (Coach coach : coaches) {
            companyContent.append(coach.getCoachType()).append(":").append(coach.getSeatCapacity()).append(":").append(coach.getFare()).append(",");
        }
        companyContent.append("\n");
        directory.writeToFile(this.trainNumber + ".txt", companyContent.toString(), true);
    }

}
