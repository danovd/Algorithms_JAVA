package _04_Search_Sort_Greedy_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Sorting {
    public static void main(String[] args) {
        // Binary search
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int key = Integer.parseInt(sc.nextLine());
        System.out.println(findIndex(arr, key));

    }

    private static int findIndex(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = (start + end) / 2;
            int current = arr[middle];

            if(key < current){
                end = middle - 1;
            }else if(key > current){
                start = middle + 1;
            }else{
                return middle;
            }
        }
        return -1;
    }
}
