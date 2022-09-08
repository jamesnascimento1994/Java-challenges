/*
 * Challenge Fifteen: Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
 * Challenge Source: https://www.codewars.com/kata/517abf86da9663f1d2000003
 */

public class ToCamelCase {
    static String toCamelCase(String s){
        String[] words = s.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
          
          if (i == 0) {
            builder.append(words[i]);
          } else if (words[i].length() > 0) {
            builder.append(words[i].replaceFirst(words[i].substring(0,1), words[i].substring(0,1).toUpperCase()));
          }
        }
        return new String(builder);
      }

      public static void main(String[] args) {
        System.out.println(ToCamelCase.toCamelCase("the-stealth-warrior"));
        System.out.println(ToCamelCase.toCamelCase("The_Stealth_Warrior"));
      }
}
