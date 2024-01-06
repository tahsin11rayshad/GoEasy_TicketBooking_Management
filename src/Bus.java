import java.util.List;

public class Bus implements IVehicle{
    private String companyName;
    private String busNumber;
    private String busType;
    private String startFrom;
    private String destination;
    private String departureTime;
    private double fare;
    private int seatCapacity;
    private Directory directory;

    public Bus(String companyName, String busNumber, String busType, String startFrom, String destination, String departureTime, double fare, int seatCapacity) {
        this.companyName = companyName;
        this.busNumber = busNumber;
        this.busType = busType;
        this.startFrom = startFrom;
        this.destination = destination;
        this.departureTime = departureTime;
        this.fare = fare;
        this.seatCapacity = seatCapacity;
        this.directory = new Directory("Bus");
    }

    public void registerVehicle() {
        directory.createDirectory();

        String allBusesContent = this.busNumber + "," + this.companyName + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "," + this.fare + "," + this.seatCapacity + "," + this.busType + "\n";
        directory.writeToFile("allbuses.txt", allBusesContent, true);

        String companyContent = this.busNumber + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "," + this.fare + "," + this.seatCapacity + "," + this.busType + "\n";
        directory.writeToFile(this.companyName + ".txt", companyContent, true);
    }
}
