package polymorphism;

public class Vehicle {
    String brand;
    String model;

    public Vehicle (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void move() {
        System.out.println("Vehicle moving...");
    }
}
