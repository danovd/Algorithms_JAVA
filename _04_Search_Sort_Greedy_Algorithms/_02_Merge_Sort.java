package _04_Search_Sort_Greedy_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Merge_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                                .toArray();
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void sort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }

    private static void mergeSort(int[] arr, int begin, int end) {
        if(begin >= end){
            return;
        }
        int middle = (begin + end) / 2;


        mergeSort(arr, begin, middle);
        mergeSort(arr, middle + 1, end);
        
        merge(arr, begin, middle, end);
    }

    private static void merge(int[] arr, int begin, int middle, int end) {
        if(middle < 0 || middle >= arr.length || arr[middle] <= arr[middle + 1]){
            return;
        }
        int left = begin;
        int right = middle + 1;

        int [] helper = new int [arr.length];
        for (int i = begin; i <= end ; i++) {
            helper[i] = arr[i];
        };

        for (int i = begin; i <= end ; i++) {
            if(left > middle){
                arr[i] = helper[right++];
            }else if(right > end){
                arr[i] = helper[left++];
            }else if(helper[left] < helper[right]){
                arr[i] = helper[left++];
            }else {
                arr[i] = helper[right++];
            }

        }
    }
}
