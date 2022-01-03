/*
 * Challenge Four: Return the number (count) of vowels in the given string. We will consider a, e, i, o, u as vowels for this Kata (but not y). The input string will only consist of lower case letters and/or spaces.


 * Challenge Source: https://www.codewars.com/kata/54ff3102c1bad923760001f3
 */

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
          if (str.charAt(i) == 'a') {
            vowelsCount++;
          }
          if (str.charAt(i) == 'e') {
            vowelsCount++;
          }
          if (str.charAt(i) == 'i') {
            vowelsCount++;
          }
          if (str.charAt(i) == 'o') {
            vowelsCount++;
          }
          if (str.charAt(i) == 'u') {
            vowelsCount++;
          }
        }
        return vowelsCount;
      } 
      public static void main(String[] args) {
          System.out.println(Vowels.getCount("abracadabra"));
      }
}
