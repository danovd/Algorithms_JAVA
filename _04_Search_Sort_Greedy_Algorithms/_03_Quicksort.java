package _04_Search_Sort_Greedy_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Quicksort {
    public static int arr [];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    private static void sort(int low, int high) {
        int i = low, j = high;

        int pivot = arr[low + (high - low) / 2];

        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (low < j)
            sort(low, j);
        if (i < high)
            sort(i, high);
    }



    private static void swap(int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
