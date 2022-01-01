import java.util.stream.Collectors;

/*
 * Challenge Three: Trolls are attacking your comment section! A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat. Your task is to write a function that takes a string and return a new string with all vowels removed. For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
 * Challenge Source: https://www.codewars.com/kata/52fba66badcd10859f00097e
 */

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        String vowels = "aeiouAEIOU";
        return str.chars().filter(c -> vowels.indexOf(c) == -1).mapToObj(c->""+(char)c).collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This website is for losers LOL!"));
    }
}
