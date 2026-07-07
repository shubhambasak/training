package  searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.print("What is your Target? (Enter the number): ");
        int target = sc.nextInt();
        int index = -1;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > arr[mid]) left = mid + 1;
            else if (target < arr[mid]) right = mid - 1;
            else {
                index = mid;
                break;
            }
        }


        if (index == -1) System.out.println("Target not found.");
        else System.out.println("Target found at index " + index);

        int max = 0;
        int min = 1000000;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element in the array is " + max);
        System.out.println("Minimum element in the array is " + min);

        sc.close();
    }
}