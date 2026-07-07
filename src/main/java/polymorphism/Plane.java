package polymorphism;

public class Plane extends Vehicle {
    public Plane(String brand, String model) {
        super(brand, model);
    }

    @Override
    void move() {
        System.out.println("Flying the plane..");
    }
}
