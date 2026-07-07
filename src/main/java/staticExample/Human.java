package staticExample;

public class Human {
    int age;
    double height;
    double weight;
    static long population;

    public Human(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        Human.population++;
    }
}
