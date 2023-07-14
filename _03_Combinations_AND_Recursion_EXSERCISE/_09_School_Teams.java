package _03_Combinations_AND_Recursion_EXSERCISE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _09_School_Teams {

   public static String [] girls;
   public static String [] boys;

   public static String [] girlsCombinations = new String[3];
   public static String [] boysCombinations = new String[2];

   public static List<String> allGirls = new ArrayList<>();
   public static List<String> allBoys = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        girls = sc.nextLine().split(", ");
        boys = sc.nextLine().split(", ");
        
        combineGirls(0, 0);
        combineBoys(0, 0);

        for (String allGirl : allGirls) {
            for (String allBoy : allBoys) {
                System.out.println(allGirl + ", " + allBoy);
            }
        }
    }

    private static void combineGirls(int index, int start) {

        if(index == girlsCombinations.length){
            allGirls.add(String.join(", ", girlsCombinations));
        }else{
            for (int i = start; i < girls.length; i++) {
                girlsCombinations[index] = girls[i];
                System.out.println("index " + index +";  i: " + i);
                combineGirls(index + 1, i + 1);
            }

        }
    }
    private static void combineBoys(int index, int start) {
        if(index == boysCombinations.length){
            allBoys.add(String.join(", ", boysCombinations));
        }else{
            for (int i = start; i < boys.length; i++) {
                boysCombinations[index] = boys[i];
                combineBoys(index + 1, i + 1);
            }
        }
    }
}


/*


input:
Lisa, Yoana, Marta, Rachel
George, Garry, Bob



output:

Lisa, Yoana, Marta, George, Garry
Lisa, Yoana, Marta, George, Bob
Lisa, Yoana, Marta, Garry, Bob
Lisa, Yoana, Rachel, George, Garry
Lisa, Yoana, Rachel, George, Bob
Lisa, Yoana, Rachel, Garry, Bob
Lisa, Marta, Rachel, George, Garry
Lisa, Marta, Rachel, George, Bob
Lisa, Marta, Rachel, Garry, Bob
Yoana, Marta, Rachel, George, Garry
Yoana, Marta, Rachel, George, Bob
Yoana, Marta, Rachel, Garry, Bob




 */



/*
input:
Linda, Amy, Katty
John, Bill


output:
Linda, Amy, Katty, John, Bill


 */