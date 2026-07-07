package inheritance;

public class Person {
    String name;
    int age;
    double height;
    double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.height = student.height;
        this.weight = student.weight;
//        super();
    }

    public Person() {

    }

    public void working() {
        System.out.println("Working on some stuff");
    }

}
