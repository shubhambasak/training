package conditionals;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q. print weather a user can vote or not.

//        System.out.print("How old are you? ");
//        int age = sc.nextInt();
//
//        if (age >= 18 && age <= 100) {
//            System.out.println("You can vote");
//        } else {
//            System.out.println("You cannot vote");
//        }


        // Q. take the total bill amount from the user.
            // give him/her a 15% discount if bill exceeds 5000.
//        System.out.print("What is your total bill amount? ");
//        double totalBill = sc.nextDouble();
//
//        if (totalBill >= 5000) {
//            double discount = totalBill * 0.15;
//            System.out.println("Hurray!! Congrats you got 15% discount on your purchase");
//            System.out.println("Kindly pay the remaining $" + (totalBill - discount));
//        } else {
//            System.out.println("Please pay your bill of $" + totalBill);
//        }


        // take three numbers as input and print the largest among them.
//        System.out.print("Enter the first number here: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter the second number here: ");
//        int num2 = sc.nextInt();
//        System.out.print("Enter the third number here: ");
//        int num3 = sc.nextInt();
////
//        if (num1 > num2) {
//            if (num1 > num3) {
//                System.out.println(num1);
//            } else {
//                System.out.println(num3);
//            }
//        } else {
//            if (num2 > num3) {
//                System.out.println(num2);
//            } else {
//                System.out.println(num3);
//            }
//        }

        // ternary operator

        // print weather a number given by user is even or odd.

//        System.out.print("Please enter a number here: ");
//        int number = sc.nextInt();
//
//        String result = (number % 2 == 0) ? "Even" : "Odd";
//        System.out.println(result);

//        if (number % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }



        // based on the marks provided by the user give me some grades.

        System.out.print("What is your marks? ");
        double marks = sc.nextDouble();

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 80) {
            System.out.println("B");
        } else if (marks >= 70) {
            System.out.println("C");
        } else if (marks >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }







    }
}
