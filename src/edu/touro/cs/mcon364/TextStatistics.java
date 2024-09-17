package edu.touro.cs.mcon364;

import java.util.*;

/**
 * Homework #2 - 9/18/2024
 * 
 * @author Aryeh Zucker
 */
public class TextStatistics{
    /**
     * @return the number of words in text
     */
    public static int wordCount(String text){
        Scanner scan = new Scanner(text);
        int count = 0;

        // Count the number of words in text
        while(scan.hasNext()){
            scan.next();
            count++;
        }

        scan.close();

        return count;
    }

    /**
     * @return the number of unique words in text
     */
    public static int uniqueWordCount(String text){
        Scanner scan = new Scanner(text.toLowerCase());
        Set<String> uniqueWords = new HashSet<>();

        // Iterate through each word in text, adding each one to the set of all words
        while(scan.hasNext()){
            uniqueWords.add(scan.next());
        }
        
        scan.close();

        return uniqueWords.size();
    }

    /**
     * @return a Map containing the number of occurences for each word
     */
    public static Map<String, Integer> wordStats(String text){
        Scanner scan = new Scanner(text.toLowerCase());

        // Create a Map to contain the number of occurances for each word
        Map<String, Integer> stats = new HashMap<>();

        // Iterate through each word in text, increasing its current count in the Map by one
        while(scan.hasNext()){
            String word = scan.next();
            int count = stats.getOrDefault(word, 0);
            stats.put(word, count + 1);
        }
        
        scan.close();

        return stats;
    }

    /**
     * @return the number of unique letters in text
     */
    public static int letterCount(String text){
        HashSet<Character> letters = new HashSet<>();
        
        // Add each letter to the Set to remove repetition (ignoring case)
        for(char c: text.toLowerCase().toCharArray()){
            letters.add(c);
        }

        return letters.size();
    }

    /**
     * @return a Map containing the number of occurances for each letter
     */
    public static Map<Character, Integer> letterStats(String text){
        HashMap<Character, Integer> stats = new HashMap<>();

        // Iterate through each letter in text, increasing its current count in the Map by one (ignoring case)
        for(Character c: text.toLowerCase().toCharArray()){
            int count = stats.getOrDefault(c, 0);
            stats.put(c, count + 1);
        }

        return stats;
    }
}
