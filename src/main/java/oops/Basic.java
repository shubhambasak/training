package oops;
public class Basic{
    public static void main(String[] args){
        Employee em1 = new Employee("shubham", 111, "potty");
        em1.details();
    }
}

class Employee{
    String name;
    int emp_id;
    String department;

    Employee(String ramu, int lumber, String defartment){
        this.name = ramu;
        this.emp_id = lumber;
        this.department = defartment;
    }

    void details(){
        System.out.println(name);
        System.out.println(emp_id);
        System.out.println(department);
    }
}