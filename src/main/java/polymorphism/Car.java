package polymorphism;

public class Car extends Vehicle {
    public Car (String brand, String model) {
        super(brand, model);
    }

    @Override
    void move() {
        System.out.println("Driving the car..");
    }
}
