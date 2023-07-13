package _03_Combinations_AND_Recursion_EXSERCISE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03_Combinations_With_Repetition {
    public static int[] arr;
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        arr = new int[k];

        combinations(0, 1);
    }

    private static void combinations(int index, int start) {
        if(index == arr.length){
            printArr();
        }else{
            for (int i = start; i <= n ; i++) {
                arr[index] = i;
                combinations(index + 1, i);
            }
        }
    }

    private static void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
