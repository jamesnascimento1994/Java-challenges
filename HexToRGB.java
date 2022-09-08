/*
 * Challenge Fourteen: When working with color values it can sometimes be useful to extract the individual red, green, and blue (RGB) component values for a color. Implement a function that meets these requirements:
 * Accepts a case-insensitive hexadecimal color string as its parameter (ex. "#FF9933" or "#ff9933")
 * Returns a Map<String, int> with the structure {r: 255, g: 153, b: 51} where r, g, and b range from 0 through 255 Note: your implementation does not need to support the shorthand form of hexadecimal notation (ie "#FFF")
 * 
 * Challenge Source: https://www.codewars.com/kata/5282b48bb70058e4c4000fa7
 */

public class HexToRGB {
    public static int[] hexStringToRGB(String hex) {
        int r = Integer.valueOf(hex.substring(1,3), 16);
        int g = Integer.valueOf(hex.substring(3,5), 16);
        int b = Integer.valueOf(hex.substring(5,7), 16);
        
        int[] rgb = {r,g,b};
        return rgb;
      }

    public static void main(String[] args) {
        System.out.println(HexToRGB.hexStringToRGB("#FF9933"));
        System.out.println(HexToRGB.hexStringToRGB("#beaded"));
        System.out.println(HexToRGB.hexStringToRGB("#Fa3456"));
    }
}
