import java.util.List;
public class Plane implements IVehicle{
    private String companyName;
    private String boingNumber;
    private String startFrom;
    private String destination;
    private String departureTime;
    private List<Coach> coaches;
    private Directory directory;

    public Plane(String companyName, String boingNumber, String startFrom, String destination, String departureTime, List<Coach> coaches) {
        this.companyName = companyName;
        this.boingNumber = boingNumber;
        this.startFrom = startFrom;
        this.destination = destination;
        this.departureTime = departureTime;
        this.coaches = coaches;
        this.directory = new Directory("Plane");
    }

    public void registerVehicle() {
        directory.createDirectory();

        StringBuilder allPlanesContent = new StringBuilder(this.companyName + "," + this.boingNumber + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "\n");
        for (Coach coach : coaches) {
            allPlanesContent.append(coach.getCoachType()).append(":").append(coach.getSeatCapacity()).append(":").append(coach.getFare()).append(",");
        }
        allPlanesContent.append("\n");
        directory.writeToFile("allplanes.txt", allPlanesContent.toString(), true);

        StringBuilder companyContent = new StringBuilder(this.boingNumber + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "\n");
        for (Coach coach : coaches) {
            companyContent.append(coach.getCoachType()).append(":").append(coach.getSeatCapacity()).append(":").append(coach.getFare()).append(",");
        }
        companyContent.append("\n");
        directory.writeToFile(this.companyName + ".txt", companyContent.toString(), true);
    }
}
