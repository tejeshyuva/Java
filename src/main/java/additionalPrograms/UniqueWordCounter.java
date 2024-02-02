package additionalPrograms;

import java.util.HashMap;

public class UniqueWordCounter {

    public static HashMap<String, Integer> countUniqueWords(String str) {
        if (str == null || str.isEmpty()) {
            return new HashMap<>();
        }

        // Split the string into words
        String[] words = str.split("\\s+");

        // Create a HashMap to store word counts
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            if (!word.isEmpty()) { // Exclude empty strings
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}
