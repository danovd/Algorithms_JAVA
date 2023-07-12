package _02_Combinatorial_Algoritms;

import java.util.Scanner;

// ЕДИНСТВЕНА РАЗЛИКА С ПРЕДХОДНА ЗАДАЧА Е ЕДИН СИМВОЛ< ВИЖ ПО-ДОЛУ В ЗАКОМЕНТИРАНОТО, ред32


public class _06_Combinations_With_Repetitions {
    public static String[] elements;
    public static String[] variations;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        elements = sc.nextLine().split("\\s+");

        int k = Integer.parseInt(sc.nextLine());
        variations = new String[k];


        combinations(0, 0);

    }

    public static void combinations(int index, int start){
        if(index == variations.length){
            print(variations);
        }else{
            for (int i = start; i < elements.length; i++) {
                variations[index] = elements[i];
                combinations(index + 1, i);                                 /// ТУК ВМЕСТО i+1 => i
            }
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
