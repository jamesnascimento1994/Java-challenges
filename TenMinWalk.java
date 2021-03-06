import java.util.HashMap;
import java.util.Map;

/*
 * Challenge Two: You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']. You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.
 * Challenge Source: https://www.codewars.com/kata/50654ddff44f800200000004/java
 */

public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    // Insert brilliant code here
    if (walk.length != 10) return false;
    
    Map <Character, Integer> directionsTaken = new HashMap<>();
    directionsTaken.put('n',0);
    directionsTaken.put('s',0);
    directionsTaken.put('w',0);
    directionsTaken.put('e',0);
    
    for (char dir : walk) {
      directionsTaken.put(dir, directionsTaken.get(dir) + 1); 
    }
    return directionsTaken.get('s') == directionsTaken.get('n') && directionsTaken.get('w') == directionsTaken.get('e');
  }

  public static void main(String[] args) {
      System.out.println(TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
      System.out.println(TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
      System.out.println(TenMinWalk.isValid(new char[] {'w'}));
      System.out.println(TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
  }
}