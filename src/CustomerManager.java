import java.util.ArrayList;
import java.util.List;
public class CustomerManager {
    private Directory directory;
    private List<String> customers;

    public CustomerManager(String subdirectory) {
        this.directory = new Directory(subdirectory);
        this.customers = new ArrayList<>();
    }

    public void loadCustomers() {
        // Read all customers' information from allcustomers.txt
        String allCustomersContent = directory.readFromFile("allcustomers.txt");

        // Split the content by lines to get each customer's information
        String[] lines = allCustomersContent.split("\n");

        // Add each customer's information to the list
        for (String line : lines) {
            customers.add(line);
        }
    }

    public String getCustomerInfo(String NID) {
        for (String customer : customers) {
            // Split the customer's information by comma to get the details
            String[] details = customer.split(",");

            // The NID is the second detail
            if (details[1].equals(NID)) {
                // Return the customer's information if the NID matches
                return customer;
            }
        }

        // Return null if no customer with the given NID is found
        return null;
    }
}
