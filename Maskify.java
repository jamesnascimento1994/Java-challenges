/*
 * Challenge Four: Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it. Your task is to write a function maskify, which changes all but the last four characters into '#'.

 * Challenge Source: https://www.codewars.com/kata/5412509bd436bd33920011bc
 */

public class Maskify {
    public static String maskify(String str) {
        if (str.length() <= 4) return str;
        String result = "";
        for (int i = 0; i < str.length()-4; i++) {
          result += '#';
        }
      return result + str.substring(str.length()-4);
    }

    public static void main(String[] args) {
        System.out.println(Maskify.maskify("4556364607935616"));
        System.out.println(Maskify.maskify("64607935616"));
        System.out.println(Maskify.maskify("1"));
        System.out.println(Maskify.maskify(""));
        System.out.println(Maskify.maskify("Skippy"));
        System.out.println(Maskify.maskify("Nananananananananananananananana Batman!"));
    }
}
