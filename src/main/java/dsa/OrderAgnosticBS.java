package dsa;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = {10, 29, 38, 59, 62, 76, 89, 93};
        int[] arr2 = {99, 88, 73, 65, 58, 47, 39, 25};

        System.out.print("Enter the target element: ");
        int target = scanner.nextInt();

        int result = ogBS(arr2, target);

        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element is at index: " + result);
        }
    }

    static int ogBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        return -1;
    }
}
