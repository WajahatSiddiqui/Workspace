import java.util.Arrays;
import java.util.HashSet;


public class StringOps {
	
	public static char [] removeDups(String str) {
		int len = str.length();
		char [] c = str.toCharArray();
		Arrays.sort(c);
		int j = 1;
		for (int i = 1; i < len; i++) {
			if (c[i-1] != c[i]) {
				c[j++] = c[i];
			}
		}
		c[j] = '\0';
		return c;
	}
	
	public static String removeDups1(String str) {
		HashSet<Character> hashset = new HashSet<>();
		int len = str.length();
		for (int i = 0; i < len; i++) {
			hashset.add(str.charAt(i));
		}
		return hashset.toString();
	}
	private static final int NO_OF_CHARS = 256;
	public static char [] removeDups2(String str) {
		boolean [] visited = new boolean[NO_OF_CHARS];
		Arrays.fill(visited, false);
		int len = str.length();
		char [] c = str.toCharArray();
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (!visited[c[i]]) {
				visited[c[i]] = true;
				c[j++] = c[i];
			}
		}
		c[j] = '\0';
		return c;
	}
	
	public static void main(String args[]) {
		System.out.println(removeDups("baaccd"));
		System.out.println(removeDups1("baaccd"));
		System.out.println(removeDups2("baaccd"));
	}
}
