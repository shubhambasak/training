package  searching;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements: ");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) arr[i] = sc.nextInt();

        System.out.print("What is your Target? (Enter the number): ");
        int target = sc.nextInt();
        int index = 0, result = 0;
        for(int i = 0; i<n; i++) {
            if(target == arr[i]){
                result = arr[i];
                index = i;
                break;
            }
        }

        if(result == -1) System.out.println("Target not found.");
        else System.out.println("Target found at index " + index);

        int max = 0;
        int min = 1000000;
        for(int i = 0; i<n; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Maximum element in the array is " + max);
        System.out.println("Minimum element in the array is " + min);

        sc.close();
    }
}