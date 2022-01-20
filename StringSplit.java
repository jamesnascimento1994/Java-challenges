/*
 * Challenge Twelve: Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

 * Challenge Source: https://www.codewars.com/kata/515de9ae9dcfc28eb6000001
 */

public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
      if (s.length() % 2 != 0) {
        s = s + '_';
      }
      return s.split("(?<=\\G.{2})");
    }

    public static void main(String[] args) {
        System.out.println(StringSplit.solution("abc"));
        System.out.println(StringSplit.solution("abcdef"));
    }
}