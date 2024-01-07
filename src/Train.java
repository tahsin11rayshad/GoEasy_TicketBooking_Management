import java.util.List;

public class Train implements IRegisterVehicle{
    private String trainNumber;
    private String trainName;
    private String startFrom;
    private String destination;
    private String departureTime;
    private List<Coach> coaches;
    private Directory directory;

    public Train(String trainNumber, String trainName, String startFrom, String destination, String departureTime, List<Coach> coaches) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.startFrom = startFrom;
        this.destination = destination;
        this.departureTime = departureTime;
        this.coaches = coaches;
        this.directory = new Directory("Train");
    }

    public void registerVehicle() {
        directory.createDirectory();

        StringBuilder allTrainsContent = new StringBuilder(this.trainNumber + "," + this.trainName + "," + this.startFrom + "," + this.destination + "," + this.departureTime + ",");
        for (Coach coach : coaches) {
            allTrainsContent.append(coach.getCoachType()).append(":").append(coach.getSeatCapacity()).append(":").append(coach.getFare()).append(",");
        }
        allTrainsContent.append("\n");
        directory.writeToFile("alltrains.txt", allTrainsContent.toString(), true);

        StringBuilder companyContent = new StringBuilder(this.trainName + "," + this.startFrom + "," + this.destination + "," + this.departureTime + ",");
        for (Coach coach : coaches) {
            companyContent.append(coach.getCoachType()).append(":").append(coach.getSeatCapacity()).append(":").append(coach.getFare()).append(",");
        }
        companyContent.append("\n");
        directory.writeToFile(this.trainNumber + ".txt", companyContent.toString(), true);
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getStartFrom() {
        return startFrom;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public Directory getDirectory() {
        return directory;
    }


}
