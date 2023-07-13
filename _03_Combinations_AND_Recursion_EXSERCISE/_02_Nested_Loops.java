package _03_Combinations_AND_Recursion_EXSERCISE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_Nested_Loops {
    public static int[] arr;
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(reader.readLine());
        arr = new int[n];
        
        permute(0);
    }

    private static void permute(int i) {
        if(i == arr.length){
            printArr();
        }else{
            for (int j = 1; j <= n ; j++) {
                arr[i] = j;
                permute(i + 1);
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
