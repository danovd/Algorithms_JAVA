package _02_Combinatorial_Algoritms;

import java.util.Scanner;
///  ЕДИНСТВЕНАТА ПРОМЯНА С ПРЕДИШНАТА ЗАДАЧА Е ЗАКОМЕНТИРАНОТО - ПРЕМАХВА СЕ.

public class _04_Variations_With_Repetitions {
    public static String[] elements;
    public static String[] variations;
    public static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        elements = sc.nextLine().split("\\s+");

        int k = Integer.parseInt(sc.nextLine());
        variations = new String[k];
        used = new boolean[elements.length];

        variations(0);

    }

    public static void variations(int index){
        if(index == variations.length){
            print(variations);
            return;
        }
        for (int i = 0; i < elements.length; i++) {
        //    if(!used[i]){
        //        used[i] = true;
                variations[index] = elements[i];
                variations(index + 1);
          //      used[i] = false;
          //  }
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
