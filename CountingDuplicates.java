import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Challenge Eleven: Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

 * Challenge Source: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/java
 */

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        ArrayList<Character> duplicates = new ArrayList<>();
        List<Character> arr = Arrays.asList(
          text.toLowerCase().chars().mapToObj(ch -> (char) ch).toArray(Character[]::new));
        
          for (char ch : text.toCharArray()) {
            if (Collections.frequency(arr, ch) >  1 && !duplicates.contains(ch)) {
                duplicates.add(ch);
            }
        }
        return duplicates.size();
    }
    
    public static void main(String[] args) {
        System.out.println(CountingDuplicates.duplicateCount("abcde"));
        System.out.println(CountingDuplicates.duplicateCount("aabbcde"));
        System.out.println(CountingDuplicates.duplicateCount("aabBcde"));
        System.out.println(CountingDuplicates.duplicateCount("indivisibility"));
        System.out.println(CountingDuplicates.duplicateCount("Indivisibilities"));
        System.out.println(CountingDuplicates.duplicateCount("aA11"));
        System.out.println(CountingDuplicates.duplicateCount("ABBA"));
    }
}
