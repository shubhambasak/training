import java.util.Scanner;

public class LearnArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {13, 19, 77, 51, 59, 99, 67};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // arrays are mutable.
        arr[0] = 33;

        // enhanced for loop.

//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

////        int a = 10;
//
//        int[] nums = new int[5];
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print("Enter a number here: ");
//            nums[i] = scanner.nextInt();
//        }
//
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }

        System.out.println();

        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter a name here: ");
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            if (i == 0) {
                System.out.print("| ");
            }
            System.out.print(names[i] + " | ");
        }


//        for (String name : names) {
//            System.out.print(name + " | ");
//        }

    }
}
