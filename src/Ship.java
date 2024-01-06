import java.util.List;

public class Ship implements IRegisterVehicle{
    private String companyName;
    private String shipName;
    private int shipNumber;
    private String startFrom;
    private String destination;
    private String departureTime;
    private List<Coach> coaches;
    private Directory directory;

    public Ship(String companyName, String shipName, int shipNumber, String startFrom, String destination, String departureTime, List<Coach> coaches) {
        this.companyName = companyName;
        this.shipName = shipName;
        this.shipNumber = shipNumber;
        this.startFrom = startFrom;
        this.destination = destination;
        this.departureTime = departureTime;
        this.coaches = coaches;
        this.directory = new Directory("Ship");
    }

    public void registerVehicle() {
        directory.createDirectory();

        StringBuilder allShipsContent = new StringBuilder(this.companyName + "," + this.shipName + "," + this.shipNumber + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "\n");
        for (Coach coach : coaches) {
            allShipsContent.append(coach.getCoachType()).append(":").append(coach.getSeatCapacity()).append(":").append(coach.getFare()).append(",");
        }
        allShipsContent.append("\n");
        directory.writeToFile("allships.txt", allShipsContent.toString(), true);

        StringBuilder companyContent = new StringBuilder(this.shipName + "," + this.shipNumber + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "\n");
        for (Coach coach : coaches) {
            companyContent.append(coach.getCoachType()).append(":").append(coach.getSeatCapacity()).append(":").append(coach.getFare()).append(",");
        }
        companyContent.append("\n");
        directory.writeToFile(this.companyName + ".txt", companyContent.toString(), true);
    }
}
