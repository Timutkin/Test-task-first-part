package main;

import pair.Pair;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        printStatistics(args);
    }

    /**
     * Print statistics about words.
     *
     * @param words the words
     */
    public static void printStatistics(String[] words){
        System.out.println(String.format("There are %d words in the text", words.length));
        System.out.println("TOP 10:");
        getTop10(words).forEach(o1->System.out.println(o1.getRepeat() + "-" + o1.getWord()));
    }

    /**
     * Get top 10 list by repeats and name.
     *
     * @param words the words
     * @return the list
     */
    public static List<Pair>  getTop10(String[] words){
       if (words.length == 0){
           System.err.println("Words not found");
       }
       Map<String, Integer> top = new HashMap<>();
       List<Pair> pairs = new ArrayList<>();
       for ( String key: words){
           if (top.containsKey(key)){
               top.put(key, top.get(key)+1);
           }
           else {
               top.put(key, 1);
           }
       }

        top.forEach((key, value) -> pairs.add(new Pair(value, key)));

        return pairs.stream()
                .sorted(Comparator.comparingInt(Pair::getRepeat)
                        .reversed()
                        .thenComparing(Pair::getWord))
                .collect(Collectors.toList());

    }
}
