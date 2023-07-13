package _03_Combinations_AND_Recursion_EXSERCISE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _01_Reverse_Array_With_Recursion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] elements = reader.readLine().split("\\s+");

        printReversedArr(elements, elements.length - 1);
    }

    private static void printReversedArr(String[] elements, int i) {
        if(i < 0){
            return;
        }
        System.out.print(elements[i] + " ");
        printReversedArr(elements, i - 1);
    }
}
