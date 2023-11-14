public class WashingMachine {
    // define the selected Attributes
    private String brand;
    private String model;
    private double capacity;
    private String color;
    private String status;
    private int timer;
    

    // Set the default constructor
    public WashingMachine() {
        brand = "Unknown";
        model = "Unknown";
        capacity = 0;
        color = "White";
        status = "Off";
        timer = 0;
    }

    // Parameterized constructor
    public WashingMachine(String brand, String model, double capacity, String color, String status, int timer) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.color = color;
        this.status = status;
        this.timer = timer;
    }

    // Method to print attribute values
    public void printData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity + " pounds");
        System.out.println("Color: " + color);
        System.out.println("Status: " + status);
        System.out.println("Timer: " + timer + " minutes");
    }

    // Method to change attribute values
    public void changeValues(String newBrand, double newCapacity) {
        brand = newBrand;
        capacity = newCapacity;
    }

    public static void main(String[] args) {
        // Create WashingMachine objects using different constructors
        WashingMachine washingMachine1 = new WashingMachine("LG", "Front-load", 8, "Silver", "Off", 60);
        WashingMachine washingMachine2 = new WashingMachine("Whirlpool", "Top-load", 10, "White","off",45);

        // Print attribute values in Washine Machine 1
        System.out.println("Washing Machine 1:");
        washingMachine1.printData();
        
        // Print attribute values in washine machine 2
        System.out.println("\nWashing Machine 2:");
        washingMachine2.printData();

        // Change values of attributes using the changeValues method
        washingMachine1.changeValues("Samsung", 7);
        washingMachine2.changeValues("GE", 12);

        // Print updated attribute values
        System.out.println("\nWashing Machine 1 (After Change):");
        washingMachine1.printData();

        //printupdated attribute values in washine machine 2 after changers
        System.out.println("\nWashing Machine 2 (After Change):");
        washingMachine2.printData();
    }
}

