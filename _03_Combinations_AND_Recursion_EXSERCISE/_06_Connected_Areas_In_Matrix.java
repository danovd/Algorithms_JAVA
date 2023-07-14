package _03_Combinations_AND_Recursion_EXSERCISE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class _06_Connected_Areas_In_Matrix {
    public static char[][] matrix;
    public static List<int[]> areas;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        matrix = new char[r][c];

        for (int i = 0; i < r; i++) {
            matrix[i] = sc.nextLine().toCharArray();
        }

        areas = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] == '-'){
                    areas.add(new int[]{row, col, 0});
                    findAreas(row, col);
                }

            }
        }
        System.out.println("Total areas found: " + areas.size());
        AtomicInteger counter = new AtomicInteger(1);
        areas.stream()
                .sorted((first, second) -> Integer.compare(second[2], first[2]))
                .forEach(area -> {
                    System.out.println("Area #" + counter.getAndIncrement()
                            + " at ("+ area[0] + ", " + area[1] + "), size: " + area[2]);
                });

    }

    private static void findAreas(int row, int col) {
        if(isOutOfBounds(row, col) || isNotTraversal(row, col)){
            return;
        }
        matrix[row][col] = 'V';
        areas.get(areas.size() - 1)[2]++;

        findAreas(row + 1, col);
        findAreas(row, col + 1);
        findAreas(row - 1, col);
        findAreas(row, col - 1);
    }

    private static boolean isNotTraversal(int row, int col) {
        return matrix[row][col] == 'V' || matrix[row][col] == '*';
    }

    private static boolean isOutOfBounds(int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }
}
