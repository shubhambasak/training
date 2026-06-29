package array;

import java.util.Scanner;

public class MdArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6, 99},
//                {7, 8, 9}
//        };
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }



//        int[][] arr = new int[3][3];
//
//        // input using for loop.
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print("Enter a number here: ");
//                arr[i][j] = scanner.nextInt();
//            }
//            System.out.println();
//        }
//
//        // output using for loop.
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }



        // 3-d array

//        char[][][] letters = {
//                {
//                        {'a', 'b'},
//                        {'c', 'd'}
//                },
//                {
//                        {'e', 'f'},
//                        {'g', 'h'}
//                }
//        };


//        for (int i = 0; i < letters.length; i++) {
//            for (int j = 0; j < letters[i].length; j++) {
//                for (int k = 0; k < letters[i][j].length; k++) {
//                    System.out.print(letters[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


        char[][][] letters = new char[2][2][2];

        // input
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                for (int k = 0; k < letters[i][j].length; k++) {
                    System.out.print("Enter a character: ");
                    letters[i][j][k] = scanner.next().charAt(0);
                }
                System.out.println();
            }
            System.out.println();
        }

        // output
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                for (int k = 0; k < letters[i][j].length; k++) {
                    System.out.print(letters[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
