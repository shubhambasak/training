package dsa;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 23, 17, 19, 29};

//        System.out.print("Enter the target element: ");
//        int target = scanner.nextInt();
//
//        int result = linearSearch(arr, target);
//
//        if (result == -1) {
//            System.out.println("Element not found!");
//        } else {
//            System.out.println("Element found at index: " + result);
//        }


        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }


}
