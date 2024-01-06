import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Go Easy!");
        //Directory directory = new Directory();

//        System.out.println("Please sign up to continue.");
//
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter your NID: ");
//        String NID = scanner.nextLine();
//        System.out.println("Enter your Date of Birth (dd-mm-yyyy): ");
//        String DOB = scanner.nextLine();
//        System.out.println("Enter your address: ");
//        String address = scanner.nextLine();
//        System.out.println("Enter your phone: ");
//        String phone = scanner.nextLine();
//        System.out.println("Enter your email: ");
//        String email = scanner.nextLine();
//
//        Customer customer = new Customer(name, NID, DOB, address, phone, email, directory);
//        try {
//            customer.signUp();
//            System.out.println("Congratulations! "+ name + ". You have successfully signed up!");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }




//        System.out.println("Please register your bus to continue.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your company name: ");
//        String CompanyName = scanner.nextLine();
//        System.out.println("Enter your bus number: ");
//        String BusNumber = scanner.nextLine();
//        System.out.println("Enter your bus type: ");
//        String BusType = scanner.nextLine();
//        System.out.println("Enter your start from: ");
//        String StartFrom = scanner.nextLine();
//        System.out.println("Enter your destination: ");
//        String Destination = scanner.nextLine();
//        System.out.println("Enter your departure time: ");
//        String DepartureTime = scanner.nextLine();
//        System.out.println("Enter your fare: ");
//        double Fare = scanner.nextDouble();
//        System.out.println("Enter your seat capacity: ");
//        int SeatCapacity = scanner.nextInt();
//
//
//        Bus bus = new Bus(CompanyName, BusNumber, BusType, StartFrom, Destination, DepartureTime, Fare, SeatCapacity, directory);
//        try {
//            bus.registerVehicle();
//            System.out.println("Congratulations! "+ CompanyName + ". You have successfully registered your bus!");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

//        System.out.println("Please register your train to continue.");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your train number: ");
//        int TrainNumber = scanner.nextInt();
//        scanner.nextLine();  // Consume newline left-over
//        System.out.println("Enter your train name: ");
//        String TrainName = scanner.nextLine();
//        System.out.println("Enter your start from: ");
//        String StartFrom = scanner.nextLine();
//        System.out.println("Enter your destination: ");
//        String Destination = scanner.nextLine();
//        System.out.println("Enter your departure time: ");
//        String DepartureTime = scanner.nextLine();
//
//        System.out.println("Enter your number of coaches: ");
//        int NumberOfCoaches = scanner.nextInt();
//        scanner.nextLine();  // Consume newline left-over
//
//        List<Coach> coaches = new ArrayList<>();
//        for (int i = 0; i < NumberOfCoaches; i++) {
//            System.out.println("Enter your coach type: ");
//            String CoachType = scanner.nextLine();
//            System.out.println("Enter your coach seat capacity: ");
//            int CoachSeatCapacity = scanner.nextInt();
//            scanner.nextLine();  // Consume newline left-over
//            System.out.println("Enter your coach fare: ");
//            double CoachFare = scanner.nextDouble();
//            scanner.nextLine();  // Consume newline left-over
//            Coach coach = new Coach(CoachType, CoachSeatCapacity, CoachFare);
//            coaches.add(coach);
//        }
//
//        Train train = new Train(TrainNumber, TrainName, StartFrom, Destination, DepartureTime, coaches, directory);
//        try {
//            train.registerVehicle();
//            System.out.println("Congratulations! "+ TrainName + ". You have successfully registered your train!");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }


//        System.out.println("Please register your ship to continue.");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your company name: ");
//        String CompanyName = scanner.nextLine();
//        System.out.println("Enter your ship name: ");
//        String ShipName = scanner.nextLine();
//        System.out.println("Enter your ship number: ");
//        int ShipNumber = scanner.nextInt();
//        scanner.nextLine();  // Consume newline left-over
//        System.out.println("Enter your start from: ");
//        String StartFrom = scanner.nextLine();
//        System.out.println("Enter your destination: ");
//        String Destination = scanner.nextLine();
//        System.out.println("Enter your departure time: ");
//        String DepartureTime = scanner.nextLine();
//
//        System.out.println("Enter your number of coaches: ");
//        int NumberOfCoaches = scanner.nextInt();
//        scanner.nextLine();  // Consume newline left-over
//
//        List<Coach> coaches = new ArrayList<>();
//        for (int i = 0; i < NumberOfCoaches; i++) {
//            System.out.println("Enter your coach type: ");
//            String CoachType = scanner.nextLine();
//            System.out.println("Enter your coach seat capacity: ");
//            int CoachSeatCapacity = scanner.nextInt();
//            scanner.nextLine();  // Consume newline left-over
//            System.out.println("Enter your coach fare: ");
//            double CoachFare = scanner.nextDouble();
//            scanner.nextLine();  // Consume newline left-over
//            Coach coach = new Coach(CoachType, CoachSeatCapacity, CoachFare);
//            coaches.add(coach);
//        }
//
//        Ship ship = new Ship(CompanyName, ShipName, ShipNumber, StartFrom, Destination, DepartureTime, coaches);
//        try {
//            ship.registerVehicle();
//            System.out.println("Congratulations! "+ ShipName + ". You have successfully registered your ship!");
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        System.out.println("Please register your plane to continue.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your company name: ");
        String CompanyName = scanner.nextLine();
        System.out.println("Enter your boing number: ");
        String BoingNumber = scanner.nextLine();
        System.out.println("Enter your start from: ");
        String StartFrom = scanner.nextLine();
        System.out.println("Enter your destination: ");
        String Destination = scanner.nextLine();
        System.out.println("Enter your departure time: ");
        String DepartureTime = scanner.nextLine();

        System.out.println("Enter your number of coaches: ");
        int NumberOfCoaches = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        List<Coach> coaches = new ArrayList<>();
        for (int i = 0; i < NumberOfCoaches; i++) {
            System.out.println("Enter your coach type: ");
            String CoachType = scanner.nextLine();
            System.out.println("Enter your coach seat capacity: ");
            int CoachSeatCapacity = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over
            System.out.println("Enter your coach fare: ");
            double CoachFare = scanner.nextDouble();
            scanner.nextLine();  // Consume newline left-over
            Coach coach = new Coach(CoachType, CoachSeatCapacity, CoachFare);
            coaches.add(coach);
        }

        Plane plane = new Plane(CompanyName, BoingNumber, StartFrom, Destination, DepartureTime, coaches);
        try {
            plane.registerVehicle();
            System.out.println("Congratulations! "+ BoingNumber + ". You have successfully registered your plane!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}