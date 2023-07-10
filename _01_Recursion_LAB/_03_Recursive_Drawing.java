package _01_Recursion_LAB;

import java.util.Scanner;

public class _03_Recursive_Drawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        drawFigure(n);
    }

    private static void drawFigure(int n){
        if(n == 0){
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        drawFigure(n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

}
