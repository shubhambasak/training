package polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("BMW", "M2 Competition");
        Vehicle vehicle2 = new Bike("TVS", "Apache RR 310");
        Vehicle vehicle3 = new Plane("Boeing", "787");
        Vehicle vehicle4 = new Boat("Boston Whaler", "Vantage");

        System.out.println(vehicle1.brand + " " + vehicle1.model);
        vehicle1.move();
        vehicle2.move();
        vehicle3.move();
        vehicle4.move();
    }
}
