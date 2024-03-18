java
import java.io.*;

class Customer implements Serializable {
    private int id;
    private String name;
    private String contactNo;
    private String address;

    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getAddress() {
        return address;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(1, "John Doe", "1234567890", "123 Main St, City");

        // Serialize the Customer object
        serializeObject(customer, "JavaObject.txt");

        System.out.println("Customer object has been serialized.");
    }

    public static void serializeObject(Object obj, String fileName) {
        try {
            // Create FileOutputStream to write objects to a file
            FileOutputStream fileOut = new FileOutputStream(fileName);

            // Create ObjectOutputStream to write objects to the file output stream
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // Write the object to the ObjectOutputStream
            objectOut.writeObject(obj);

            // Close the ObjectOutputStream
            objectOut.close();

            // Close the FileOutputStream
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
