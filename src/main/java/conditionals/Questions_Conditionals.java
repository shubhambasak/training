package conditionals;
import java.util.Scanner;

public class Questions_Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 10000;
        System.out.print("Enter the amount you'd want to withdraw: ");
        int withdrawAmount = scanner.nextInt();

        if (withdrawAmount > 20000) {
            System.out.println("Denied: Transaction cannot exceed the limit of 20,000.");
        } else {
            if (withdrawAmount <= balance) {
                if (withdrawAmount % 100 == 0) {
                    System.out.println("Allowed: Withdrawal successful.");
                    balance = balance - withdrawAmount;
                } else {
                    System.out.println("Denied: Transaction amount should be in multiple of 100.");
                }
            } else {
                System.out.println("Denied: Insufficient balance.");
            }
        }

        System.out.println("Balance: " + balance);

    }
}
