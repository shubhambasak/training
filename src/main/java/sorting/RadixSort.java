package sorting;

import java.util.Arrays;
public class RadixSort {

    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(arr, place);
        }
    }

    public static void countingSort(int[] arr, int place) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        for (int num : arr) {
            count[(num / place) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = (arr[i] / place) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}