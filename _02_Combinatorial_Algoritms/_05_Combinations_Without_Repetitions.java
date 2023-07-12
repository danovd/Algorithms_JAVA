package _02_Combinatorial_Algoritms;

import java.util.Scanner;

public class _05_Combinations_Without_Repetitions {
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
                combinations(index + 1, i + 1); /// НЕ start+1!!! А i+1, има разлика при изплуването нагоре от ракурсията
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
