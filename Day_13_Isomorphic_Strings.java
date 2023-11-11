import java.util.HashMap;

public class Day_13_Isomorphic_Strings {

    static class Solution {

        public static boolean areIsomorphic(String str1, String str2) {

            int n1 = str1.length();
            int n2 = str2.length();
            if (n1 != n2)
                return false;

            HashMap<Character, Character> map = new HashMap<>();
            HashMap<Character, Integer> vis = new HashMap<>();
            for (int i = 0; i < n1; i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);
                if (!map.containsKey(c1)) {
                    if (!vis.containsKey(c2)) {
                        map.put(c1, c2);
                        vis.put(c2, 1);
                    } else if (vis.get(c2) == 1)
                        return false;
                } else if (map.get(c1) != c2)
                    return false;
            }
            return true;
        }
    }

}
