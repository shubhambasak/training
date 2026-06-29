package loops;
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Q. print "Hello World" 20 times.

//        for (int i = 1; i <= 20; i++) {
//            System.out.println("Hello World " + i);
//        }

        // print the table of a number.
//        System.out.print("Write a number you want the table of: ");
//        int number = scanner.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number * i);
//        }

        // print all the numbers bt 1 to 10 skipping 5 & 7

        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7) {
                continue;
            }
            System.out.println(i);
        }

    }
}
