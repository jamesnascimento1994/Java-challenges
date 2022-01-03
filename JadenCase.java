import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Challenge Seven: Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below. Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

 * Challenge Source: https://www.codewars.com/kata/5390bac347d09b7da40006f6
 */

public class JadenCase {
    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (isEmpty(phrase))
          return null;
        return Arrays.stream(phrase.split(" ")).map(JadenCase::capitalize).collect(Collectors.joining(" "));
      }
      
      public static String capitalize(String str) {
        if (isEmpty(str))
          return null;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
      }
      
      public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
      }
      
      public static void main(String[] args) {
          System.out.println(JadenCase.toJadenCase("How can mirrors be real if our eyes aren't real"));
      }
}
