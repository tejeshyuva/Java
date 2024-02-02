package additionalPrograms;
import java.util.HashMap;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "hello world";
        printRepeatedCharacters(str);
    }

    public static void printRepeatedCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print repeated characters
        System.out.println("Repeated characters in the string:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c);
            }
        }
    }
}
