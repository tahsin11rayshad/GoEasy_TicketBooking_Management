import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Go Easy!");
        Directory directory = new Directory();

//        System.out.println("Please sign up to continue.");
//
//        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Please register your bus to continue.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your company name: ");
        String CompanyName = scanner.nextLine();
        System.out.println("Enter your bus number: ");
        String BusNumber = scanner.nextLine();
        System.out.println("Enter your bus type: ");
        String BusType = scanner.nextLine();
        System.out.println("Enter your start from: ");
        String StartFrom = scanner.nextLine();
        System.out.println("Enter your destination: ");
        String Destination = scanner.nextLine();
        System.out.println("Enter your departure time: ");
        String DepartureTime = scanner.nextLine();
        System.out.println("Enter your fare: ");
        double Fare = scanner.nextDouble();
        System.out.println("Enter your seat capacity: ");
        int SeatCapacity = scanner.nextInt();


        Bus bus = new Bus(CompanyName, BusNumber, BusType, StartFrom, Destination, DepartureTime, Fare, SeatCapacity, directory);
        try {
            bus.registerVehicle();
            System.out.println("Congratulations! "+ CompanyName + ". You have successfully registered your bus!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}