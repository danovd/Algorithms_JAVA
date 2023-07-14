package _03_Combinations_AND_Recursion_EXSERCISE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _07_Cinema {
    public static String[] seats;
    public static String[] combinations;
    public static List<String> people;
    public static boolean[] used;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         people = Arrays.stream(sc.nextLine().split(", "))
                 .collect(Collectors.toList());

        seats = new String[people.size()];
        String line = sc.nextLine();
        while(!line.equals("generate")){
            String [] tokens = line.split(" - ");

            String name = tokens[0];
            int position = Integer.parseInt(tokens[1]) - 1;

            seats[position] = name;
            people.remove(name);
            line = sc.nextLine();
        }
        combinations = new String[people.size()];
        used = new boolean[people.size()];
        permute(0);
    }

    private static void permute(int i) {
        if(i == combinations.length){
            print();
        }else{
            for (int j = 0; j < people.size(); j++) {
                if(!used[j]){
                    used[j] = true;
                    combinations[i] = people.get(j);
                    permute(i + 1);
                    used[j] = false;
                }
            }
        }
    }

    private static void print() {
     //   for(String combination : combinations){
     //       System.out.print(combination + " ");
     //   }
     //   System.out.println();

        int index = 0;
        StringBuilder lineOfResult = new StringBuilder();
        for(String seat : seats){
            if(seat != null){
                lineOfResult.append(seat).append(" ");
               // System.out.print(seat + " ");
            }else{
                lineOfResult.append(combinations[index++]).append(" ");
              //  System.out.print(combinations[index++] + " ");
            }
        }
        String res = lineOfResult.toString().trim();
        System.out.println(res);
    }
}


/*
input:
Peter, Amy, George, Rick
Amy - 1
Rick - 4
generate


outputs;
Amy Peter George Rick
Amy George Peter Rick



*/
