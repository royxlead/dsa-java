package OOP;

public class ClassesAndObjects {
    public static void main(String[] args) {
        System.out.println("Classes and Objects in Java:");

        // Defining a class
        class Car {
            // Fields (attributes)
            String color;
            String model;
            int year;

            // Constructor
            Car(String color, String model, int year) {
                this.color = color;
                this.model = model;
                this.year = year;
            }

            // Method (behavior)
            void displayInfo() {
                System.out.println("Car Model: " + model + ", Year: " + year + ", Color: " + color);
            }
        }

        // Creating objects (instances) of the class
        Car car1 = new Car("Red", "Toyota Camry", 2020);
        Car car2 = new Car("Blue", "Honda Civic", 2018);

        // Accessing fields and methods
        car1.displayInfo();
        car2.displayInfo();

        // Modifying object state
        car1.color = "Black";
        System.out.println("After repainting car1:");
        car1.displayInfo();

        // Demonstrating reference behavior
        Car car3 = car1; // car3 references the same object as car1
        car3.model = "Tesla Model 3";
        System.out.println("After changing model via car3:");
        car1.displayInfo();

        // Null reference
        Car car4 = null;
        if (car4 == null) {
            System.out.println("car4 does not reference any object.");
        }
    }
}
