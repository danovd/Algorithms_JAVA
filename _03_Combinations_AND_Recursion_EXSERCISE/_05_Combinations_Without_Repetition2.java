package _03_Combinations_AND_Recursion_EXSERCISE;

import java.util.Scanner;

public class _05_Combinations_Without_Repetition2 {
    public static int n;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        arr = new int[k];
        
        combine(0, 1);
    }

    private static void combine(int index, int start) {
        if(index == arr.length){
            printArr();
        }else{
            for (int i = start; i <= n ; i++) {
                arr[index] = i;
                combine(index + 1, i + 1);
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
