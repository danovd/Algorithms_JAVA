package _03_Combinations_AND_Recursion_EXSERCISE;

import java.util.*;
import java.util.stream.Collectors;

public class _08_Word_Cruncher {
    public static List<String> words;
    public static List<String> combined = new ArrayList<>();
    public static String target;
    public static boolean [] used;

    public static Map<Integer, List<String>> table = new HashMap<>();
    public static Map<String, Integer> occurrences = new HashMap<>();
    public static Set<String> out = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        words = Arrays.stream(sc.nextLine().split(", "))
                .collect(Collectors.toList());

        target = sc.nextLine();
        words.removeIf(next -> !target.contains(next));


        for (String substr : words) {
            occurrences.putIfAbsent(substr, 0);
            occurrences.put(substr, occurrences.get(substr) + 1);

            int index = target.indexOf(substr);
            while(index != -1){
                table.putIfAbsent(index, new ArrayList<>());
                table.get(index).add(substr);
                index = target.indexOf(substr, index + 1);
            }
        }


        permute(0);
        for (String str : out) {
            System.out.println(str);
        }
    }

    private static void permute(int i) {
        if(i == target.length()){
            print();
        }else if(table.containsKey(i)){
            List<String > strings = table.get(i);
            for (String str : strings) {
                if(occurrences.get(str) > 0){
                    occurrences.put(str, occurrences.get(str) - 1);
                    combined.add(str);
                    permute(i + str.length());
                    combined.remove(combined.size() - 1);
                    occurrences.put(str, occurrences.get(str) + 1);
                }
            }

        }
    }

    private static void print() {
        String actual = String.join("", combined);
        if(actual.contains(target)){
            out.add(String.join(" ", combined));
        }
    }
}
