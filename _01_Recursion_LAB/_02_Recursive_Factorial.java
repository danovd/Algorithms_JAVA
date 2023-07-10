package _01_Recursion_LAB;

import java.util.Scanner;

public class _02_Recursive_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        long result = calculateF(num);
        System.out.println(result);
    }

    private static long calculateF(int num) {
        if(num == 0){
            return 1;
        }
        return num * calculateF(num - 1 );
    }
}
