import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // loops are used to iterate over the same set of statement again & again.


        // Q. print "Hello World" 10 times.

//        int counter = 1;
//
//        while (counter <= 10) {
//            System.out.println("Hello World " + counter);
//            counter++;
//        }


        // print start to end given by user.

//        System.out.print("Enter the start: ");
//        int start = scanner.nextInt();
//        System.out.print("Enter the end: ");
//        int end = scanner.nextInt();
//
//        boolean isAsc = start < end;
//
//        if (isAsc) {
//            while (start <= end) {
//                System.out.println(start);
//                start++;
//            }
//        } else {
//            while (start >= end) {
//                System.out.println(start);
//                start--;
//            }
//        }


        // Q. print the table of a number given by user.

        System.out.print("Write a number you want the table of: ");
        int number = scanner.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(number * i);
            i++;
        }

    }
}
