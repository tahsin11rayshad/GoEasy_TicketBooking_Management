import java.io.IOException;
import java.util.Map;

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

    public Bus(String companyName, String busNumber, String busType, String startFrom, String destination, String departureTime, double farewi, int seatCapacity, Directory directory) {
        this.companyName = companyName;
        this.busNumber = busNumber;
        this.busType = busType;
        this.startFrom = startFrom;
        this.destination = destination;
        this.departureTime = departureTime;
        this.fare = fare;
        this.seatCapacity = seatCapacity;
        this.directory = directory;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public String getBusType() {
        return busType;
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

    public double getFare() {
        return fare;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public void setStartFrom(String startFrom) {
        this.startFrom = startFrom;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }


    public void registerVehicle() {
        directory.createDirectory();

        String allBusesContent = this.busNumber + "," + this.companyName + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "," + this.fare + "," + this.seatCapacity + "," + this.busType + "\n";
        directory.writeToFile("allbuses.txt", allBusesContent, true);

        String companyContent = this.busNumber + "," + this.startFrom + "," + this.destination + "," + this.departureTime + "," + this.fare + "," + this.seatCapacity + "," + this.busType + "\n";
        directory.writeToFile(this.companyName + ".txt", companyContent, true);
    }


}
