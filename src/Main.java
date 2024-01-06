import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to GoEasy!");

        Scanner scanner = new Scanner(System.in);

//        for(int i=0; i<5; i++){
//            System.out.println("Please register your buses first");
//
//            System.out.println("Enter your company name");
//            String companyName = scanner.nextLine();
//            System.out.println("Enter your bus number");
//            String busNumber = scanner.nextLine();
//            System.out.println("Enter your bus type");
//            String busType = scanner.nextLine();
//            System.out.println("Enter your start from");
//            String startFrom = scanner.nextLine();
//            System.out.println("Enter your destination");
//            String destination = scanner.nextLine();
//            System.out.println("Enter your departure time");
//            String departureTime = scanner.nextLine();
//            System.out.println("Enter your fare");
//            double fare = scanner.nextDouble();
//            System.out.println("Enter your seat capacity");
//            int seatCapacity = scanner.nextInt();
//            scanner.nextLine();
//
//            Bus bus = new Bus(companyName, busNumber, busType, startFrom, destination, departureTime, fare, seatCapacity);
//            bus.registerVehicle();
//
//            System.out.println("Bus registered successfully!");


//        System.out.println("Search for buses by startFrom and destination");
//        System.out.println("Enter your startFrom");
//        String startFrom = scanner.nextLine();
//        System.out.println("Enter your destination");
//        String destination = scanner.nextLine();
//
//        BusManager busManager = new BusManager("Bus", "allbuses.txt");
//        List<Bus> buses = busManager.searchBuses(startFrom, destination);
//
//        System.out.println("Here are the buses available for your search\n\n");
//
//        for (Bus bus : buses) {
//            System.out.println(bus.getCompanyName() + "\t\t" + bus.getBusNumber() + "\t\t" + bus.getBusType() + "\t\t" + bus.getStartFrom() + "\t\t" + bus.getDestination() + "\t\t" + bus.getDepartureTime() + "\t\t" + bus.getFare() + "\t\t" + bus.getSeatCapacity());
//        }


//        System.out.println("Please register your trains first");
//
//        System.out.println("Enter your train number");
//        int trainNumber = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter your train name");
//        String trainName = scanner.nextLine();
//        System.out.println("Enter your start from");
//        String startFrom = scanner.nextLine();
//        System.out.println("Enter your destination");
//        String destination = scanner.nextLine();
//        System.out.println("Enter your departure time");
//        String departureTime = scanner.nextLine();
//        System.out.println("Enter your number of coaches");
//        int numberOfCoaches = scanner.nextInt();
//        scanner.nextLine();
//
//        List<Coach> coaches = new ArrayList<>();
//        for(int i=0; i<numberOfCoaches; i++){
//            System.out.println("Enter your coach type");
//            String coachType = scanner.nextLine();
//            System.out.println("Enter your seat capacity");
//            int seatCapacity = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Enter your fare");
//            double fare = scanner.nextDouble();
//            scanner.nextLine();
//            coaches.add(new Coach(coachType, seatCapacity, fare));
//        }
//
//        Train train = new Train(trainNumber, trainName, startFrom, destination, departureTime, coaches);
//        train.registerVehicle();

        System.out.println("Search for trains by startFrom and destination");
        System.out.println("Enter your startFrom");
        String startFrom = scanner.nextLine();
        System.out.println("Enter your destination");
        String destination = scanner.nextLine();

        TrainManager trainManager = new TrainManager("Train", "alltrains.txt");
        List<Train> trains = trainManager.searchTrains(startFrom, destination);

        System.out.println("Here are the trains available for your search\n\n");

        for (Train train : trains) {
            System.out.println(train.getTrainNumber() + "\t\t" + train.getTrainName() + "\t\t" + train.getStartFrom() + "\t\t" + train.getDestination() + "\t\t" + train.getDepartureTime());
        }



    }
}