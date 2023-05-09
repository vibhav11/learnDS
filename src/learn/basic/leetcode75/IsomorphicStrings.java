package learn.basic.leetcode75;

import java.util.Arrays;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int size = 256;
        int m = s.length();
        int n = t.length();


        if (m != n)
            return false;


        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);


        int[] map = new int[size];
        Arrays.fill(map, -1);

        for (int i = 0; i < n; i++) {

            if (map[s.charAt(i)] == -1) {
                if (marked[t.charAt(i)] == true)
                    return false;

                marked[t.charAt(i)] = true;
                map[s.charAt(i)] = t.charAt(i);
            } else if (map[s.charAt(i)] != t.charAt(i))
                return false;
        }

        return true;
    }
}
