public class Bus implements IVehicle{
    private String CompanyName;
    private String BusNumber;
    private String StartFrom;
    private String Destination;
    private String DepartureTime;
    private double Fare;
    private int SeatCapacity;
    private String BusType;
    private Directory directory;

    public Bus(String CompanyName, String BusNumber, String StartFrom, String Destination, String DepartureTime, double Fare, int SeatCapacity, String BusType, Directory directory) {
        this.CompanyName = CompanyName;
        this.BusNumber = BusNumber;
        this.StartFrom = StartFrom;
        this.Destination = Destination;
        this.DepartureTime = DepartureTime;
        this.Fare = Fare;
        this.SeatCapacity = SeatCapacity;
        this.BusType = BusType;
        this.directory = directory;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getBusNumber() {
        return BusNumber;
    }

    public String getStartFrom() {
        return StartFrom;
    }

    public String getDestination() {
        return Destination;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public double getFare() {
        return Fare;
    }

    public int getSeatCapacity() {
        return SeatCapacity;
    }

    public String getBusType() {
        return BusType;
    }
    
    public void registerVehicle() {
        directory.createDirectory();

        // Prepare bus details
        String busDetails = String.join(",", CompanyName, BusNumber, StartFrom, Destination, DepartureTime, String.valueOf(Fare), String.valueOf(SeatCapacity), BusType);

        // Write to a customer-specific file
        directory.writeToFile(CompanyName + ".txt", busDetails, false);

        // Append to the all customers file
        directory.writeToFile("allcustomers.txt", busDetails + "\n", true);

        System.out.println("Bus registered successfully!");
    }



}
