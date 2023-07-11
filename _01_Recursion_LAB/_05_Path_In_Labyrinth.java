package _01_Recursion_LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_Path_In_Labyrinth {

    static List<Character> path = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());

        char [][] labyrinth = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            labyrinth[i] = sc.nextLine().toCharArray();
        }

        findPath(labyrinth, 0, 0, ' ');
    }

    private static void findPath(char [][] labyrinth, int row, int col, char direction){
        if(!isInBounds(labyrinth, row, col)
                || labyrinth[row][col] == 'V'
                || labyrinth[row][col] == '*'){
            return;
        }
        path.add(direction);

        if(labyrinth[row][col] == 'e'){
            printPath();
            path.remove(path.size() - 1);
            return;
        }

        labyrinth[row][col] = 'V';
        findPath(labyrinth, row, col+1, 'R');
        findPath(labyrinth, row+1, col, 'D');
        findPath(labyrinth, row, col-1, 'L');
        findPath(labyrinth, row-1, col, 'U');

        labyrinth[row][col] = '-';

        path.remove(path.size() - 1);
    }

    private static void printPath() {
        for (int i = 1; i < path.size(); i++) {
            System.out.print(path.get(i));
        }
        System.out.println();
    }

    private static boolean isInBounds(char[][] labyrinth, int row, int col) {
        return row < labyrinth.length && row >= 0 && col < labyrinth[row].length && col >= 0;
    }
}
