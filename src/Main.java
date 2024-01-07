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
//        String trainNumber = scanner.nextLine();
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
//
//        System.out.println("Search for trains by startFrom and destination");
//        System.out.println("Enter your startFrom");
//        String startFrom = scanner.nextLine();
//        System.out.println("Enter your destination");
//        String destination = scanner.nextLine();
//
//        TrainManager trainManager = new TrainManager("Train", "alltrains.txt");
//        List<Train> trains = trainManager.searchTrains(startFrom, destination);
//
//        System.out.println("Here are the trains available for your search\n\n");
//
//        for (Train train : trains) {
//            System.out.println(train.getTrainNumber() + "\t\t" + train.getTrainName() + "\t\t" + train.getStartFrom() + "\t\t" + train.getDestination() + "\t\t" + train.getDepartureTime());
//            for (Coach coach : train.getCoaches()) {
//                System.out.println(coach.getCoachType() + "\t\t" + coach.getSeatCapacity() + "\t\t" + coach.getFare());
//            }
//        }

//        System.out.println("Please register your ships first");
//
//        for(int i=0; i<2; i++){
//            System.out.println("Enter your company name");
//            String companyName = scanner.nextLine();
//            System.out.println("Enter your ship name");
//            String shipName = scanner.nextLine();
//            System.out.println("Enter your ship number");
//            int shipNumber = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Enter your start from");
//            String startFrom = scanner.nextLine();
//            System.out.println("Enter your destination");
//            String destination = scanner.nextLine();
//            System.out.println("Enter your departure time");
//            String departureTime = scanner.nextLine();
//            System.out.println("Enter your number of coaches");
//            int numberOfCoaches = scanner.nextInt();
//            scanner.nextLine();
//
//            List<Coach> coaches = new ArrayList<>();
//            for(int k=0; k<numberOfCoaches; k++){
//                System.out.println("Enter your coach type");
//                String coachType = scanner.nextLine();
//                System.out.println("Enter your seat capacity");
//                int seatCapacity = scanner.nextInt();
//                scanner.nextLine();
//                System.out.println("Enter your fare");
//                double fare = scanner.nextDouble();
//                scanner.nextLine();
//                coaches.add(new Coach(coachType, seatCapacity, fare));
//            }
//
//            Ship ship = new Ship(companyName, shipName, shipNumber, startFrom, destination, departureTime, coaches);
//            ship.registerVehicle();
//            System.out.println("Ship registered successfully!");
//        }

//        System.out.println("Search for ships by startFrom and destination");
//        System.out.println("Enter your startFrom");
//        String startFrom = scanner.nextLine();
//        System.out.println("Enter your destination");
//        String destination = scanner.nextLine();
//
//        ShipManager shipManager = new ShipManager("Ship", "allships.txt");
//        List<Ship> ships = shipManager.searchShips(startFrom, destination);
//
//        System.out.println("Here are the ships available for your search\n\n");
//
//        for (Ship ship : ships) {
//            System.out.println(ship.getCompanyName() + "\t\t" + ship.getShipName() + "\t\t" + ship.getShipNumber() + "\t\t" + ship.getStartFrom() + "\t\t" + ship.getDestination() + "\t\t" + ship.getDepartureTime());
//            for (Coach coach : ship.getCoaches()) {
//                System.out.println(coach.getCoachType() + "\t\t" + coach.getSeatCapacity() + "\t\t" + coach.getFare());
//            }
//        }

//        System.out.println("Please register your planes first");
//
//        for(int i=0; i<2; i++){
//            System.out.println("Enter your company name");
//            String companyName = scanner.nextLine();
//            System.out.println("Enter your boing number");
//            String boingNumber = scanner.nextLine();
//            System.out.println("Enter your start from");
//            String startFrom = scanner.nextLine();
//            System.out.println("Enter your destination");
//            String destination = scanner.nextLine();
//            System.out.println("Enter your departure time");
//            String departureTime = scanner.nextLine();
//            System.out.println("Enter your number of coaches");
//            int numberOfCoaches = scanner.nextInt();
//            scanner.nextLine();
//
//            List<Coach> coaches = new ArrayList<>();
//            for(int k=0; k<numberOfCoaches; k++){
//                System.out.println("Enter your coach type");
//                String coachType = scanner.nextLine();
//                System.out.println("Enter your seat capacity");
//                int seatCapacity = scanner.nextInt();
//                scanner.nextLine();
//                System.out.println("Enter your fare");
//                double fare = scanner.nextDouble();
//                scanner.nextLine();
//                coaches.add(new Coach(coachType, seatCapacity, fare));
//            }
//
//            Plane plane = new Plane(companyName, boingNumber, startFrom, destination, departureTime, coaches);
//            plane.registerVehicle();
//            System.out.println("Plane registered successfully!");
//        }

        System.out.println("Search for planes by startFrom and destination");
        System.out.println("Enter your startFrom");
        String startFrom = scanner.nextLine();
        System.out.println("Enter your destination");
        String destination = scanner.nextLine();

        PlaneManager planeManager = new PlaneManager("Plane", "allplanes.txt");
        List<Plane> planes = planeManager.searchPlanes(startFrom, destination);

        System.out.println("Here are the planes available for your search\n\n");

        for (Plane plane : planes) {
            System.out.println(plane.getCompanyName() + "\t\t" + plane.getBoingNumber() + "\t\t" + plane.getStartFrom() + "\t\t" + plane.getDestination() + "\t\t" + plane.getDepartureTime());
            for (Coach coach : plane.getCoaches()) {
                System.out.println(coach.getCoachType() + "\t\t" + coach.getSeatCapacity() + "\t\t" + coach.getFare());
            }
        }


    }
}