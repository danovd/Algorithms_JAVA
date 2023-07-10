package _01_Recursion_LAB;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Array_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = sumNumbers(arr, arr.length-1);

    System.out.println(sum);


    }

    private static int sumNumbers(int[] arr, int i) {
        if(i < 0){
            return 0;
        }
        return arr[i] + sumNumbers(arr, i-1);
    }
}
