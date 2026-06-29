package basics;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        byte a = sc.nextByte();
//        System.out.println(a);
//        short b = sc.nextShort();
//        System.out.println(b);
//        int c = sc.nextInt();
//        System.out.println(c);
//        long d = sc.nextLong();
//        System.out.println(d);

//        boolean e = sc.nextBoolean();
//        System.out.println(e);
//        float f = sc.nextFloat();
//        System.out.println(f);
//        double g = sc.nextDouble();
//        System.out.println(g);

        // string input
//        System.out.print("What is your name? ");
////        String name = sc.next();
//        String name = sc.nextLine();
//        System.out.println("Hello " + name);


        // there is no function in scanner to take char input.

        System.out.println("Kindly respond with [Y/N]: ");
        char letter = sc.next().charAt(0);

        System.out.println(letter);
    }
}


// snake case: my_variable_name
// camel case: myVariableName
// pascal case: MyVariableName