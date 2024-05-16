import java.util.HashMap;

public class Q08 {
    public static boolean areAnagrams(String str1, String str2) {
        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : str1.toCharArray()) {
            count.put(c, count.containsKey(c) ? count.get(c) + 1 : 1);
        }

        for (char c : str2.toCharArray()) {
            if (!count.containsKey(c)) {
                return false;
            }
            count.put(c, count.get(c) - 1);
            if (count.get(c) == 0) {
                count.remove(c);
            }
        }

        return count.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + areAnagrams(str1, str2));
    }
}
