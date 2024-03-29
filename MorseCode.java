import java.util.HashMap;
import java.util.Map;

// Challenge Thirteen: ??
// Challenge Source: ?? This was on codewars but I can't find the page.

public class MorseCode extends HashMap<String, String> {
	private static Map<String, String> map = new HashMap<>();

	static {
		String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " ", "!", ".",
				"SOS" };
		String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "|", "-.-.--",
				".-.-.-", "...---..." };
		for (int i = 0; i < alpha.length; i++) {
			map.put(dottie[i], alpha[i]);
		}
	}

	public static String get(String value) {
		String alpha = "";
		if (map.containsKey(value)) {
			alpha = map.get(value).toUpperCase();
		}
		return alpha;
	}

}
