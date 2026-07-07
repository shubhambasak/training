package inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mark", 27, 6.1, 88.4);
        Student student = new Student("Oscar", 23, 5.7, 73.7, "MCA");

        Student student1 = new Student(student);

        Employee employee = new Employee();

//        student.working();
//        employee.working();

//        System.out.println(person.name);
//        System.out.println(student.name);
//
//        System.out.println(student1.height);


        // datatype of parent class + obj of child class (allowed)
        Person student2 = new Student(student);

        // datatype of child class + obj of parent class (not-allowed)
        // if parent cannot access thing from child
        // thing you can use with person1 ref variable are things that
        // are inside the Student class.

        // how can you set the values of Student classes attributes using
        // the Person when it does'nt know what thing Student contains
//        Student person1 = new Person();
//
//        person1.education


    }


}
