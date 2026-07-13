package recursion;

public class PrintNumber {

    public static void print() {
        print1();
    }

    public static void print1() {
        System.out.println(1);
        print2();
    }

    public static void print2() {
        System.out.println(2);
        print3();
    }

    public static void print3() {
        System.out.println(3);
        print4();
    }

    public static void print4() {
        System.out.println(4);
    }

    public static void print5(int n) {
        if(n == 5) return;

        System.out.println(n);
        print5(n+1);
    }

    public static void main(String[] args) {
        print();
        print5(1);
    }
}