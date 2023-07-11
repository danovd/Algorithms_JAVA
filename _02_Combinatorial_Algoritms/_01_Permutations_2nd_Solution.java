package _02_Combinatorial_Algoritms;

import java.util.Scanner;

public class _01_Permutations_2nd_Solution {
    public static String[] elements;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        elements = sc.nextLine().split("\\s+");

        permute(0);

    }

    public static void permute(int index){
        if(index == elements.length){
            print(elements);
            return;
        }
        permute(index + 1);
        for (int i = index + 1; i < elements.length; i++) {
            swap(elements, index, i);
            permute(index + 1);
            swap(elements, index, i);

        }
    }

    private static void swap(String [] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static void print(String [] arr) {
        System.out.println(String.join(" ", arr));
    }
}
