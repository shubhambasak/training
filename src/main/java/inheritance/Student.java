package inheritance;

public class Student extends Person {

    String education;

    public Student(String name, int age, double height, double weight, String education) {
        super(name, age, height, weight);
        this.education = education;
    }

    public Student(Student student) {
        super(student);
    }

    public void demo() {
        System.out.println("I am demo");
    }
}
