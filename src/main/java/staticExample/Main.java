package staticExample;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human(29, 5.11, 88.3);
        Human human2 = new Human(25, 6.1, 79.3);

        System.out.println(Human.population);
        System.out.println(Human.population);

        fun1();
    }

    static void fun1() {
        System.out.println("Fun 1");
//        fun3();
    }

    void fun2() {
        System.out.println("Fun 2");
        fun3();
    }

    void fun3() {
        System.out.println("Fun 3");
    }

}
