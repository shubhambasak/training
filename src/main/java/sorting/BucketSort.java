package sorting;

import java.util.*;
public class BucketSort {

    public static void bucketSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        int[] bucket = new int[max + 1];

        for (int num : arr) {
            bucket[num]++;
        }

        int index = 0;

        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                arr[index++] = i;
                bucket[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        bucketSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}