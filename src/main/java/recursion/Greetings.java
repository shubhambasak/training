package recursion;

public class Greetings {

    public static void greet() {
        greet1();
    }

    public static void greet1() {
        System.out.println("Hello World.");
        greet2();
    }

    public static void greet2() {
        System.out.println("Hello World.");
        greet3();
    }

    public static void greet3() {
        System.out.println("Hello World.");
        greet4();
    }

    public static void greet4() {
        System.out.println("Hello World.");
    }

    public static void main(String[] args) {
        greet();
    }
}