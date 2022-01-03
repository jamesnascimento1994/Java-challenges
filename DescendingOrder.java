import java.util.ArrayList;
import java.util.Collections;

/*
 * Challenge Six: Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

 * Challenge Source: https://www.codewars.com/kata/5467e4d82edf8bbf40000155
 */

public class DescendingOrder {
    public static int sortDesc(final int num) {
        ArrayList<String> sort = new ArrayList<String>();
        
        String str = Integer.toString(num);
        String out = "";
        
        for (int i = 0; i < str.length(); i++) {
          sort.add(str.charAt(i)+"");
        }
        
        Collections.sort(sort);
        Collections.reverse(sort);
        
        for (int i = 0; i < sort.size(); i++) {
          out += sort.get(i);
        }
        
        return Integer.parseInt(out);
    }

    public static void main(String[] args) {
        System.out.println(DescendingOrder.sortDesc(42145));
        System.out.println(DescendingOrder.sortDesc(145263));
        System.out.println(DescendingOrder.sortDesc(123456789));
    }
}
