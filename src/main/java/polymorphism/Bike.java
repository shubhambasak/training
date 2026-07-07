package polymorphism;

public class Bike extends Vehicle {
    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    void move() {
        System.out.println("Riding the bike..");
    }
}
