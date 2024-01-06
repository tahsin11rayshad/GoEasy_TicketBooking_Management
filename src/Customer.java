
import java.io.IOException;
import java.util.List;

public class Customer {
    private String name;
    private String NID;
    private String DOB;
    private String address;
    private String phone;
    private String email;
    private Directory directory;
    private List<String> customers;


    public Customer(String name, String NID, String DOB, String address, String phone, String email) {
        this.name = name;
        this.NID = NID;
        this.DOB = DOB;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.directory = new Directory("Customer");
    }

    public Customer(List<String> customers) {
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public String getNID() {
        return NID;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void signUp() throws IOException {
        directory.createDirectory();

        // Prepare customer details
        String customerDetails = String.join(",", name, NID, DOB, address, phone, email);

        // Write to a customer-specific file
        directory.writeToFile(NID + ".txt", customerDetails, false);

        // Append to the all customers file
        directory.writeToFile("allcustomers.txt", customerDetails + "\n", true);
    }

}
