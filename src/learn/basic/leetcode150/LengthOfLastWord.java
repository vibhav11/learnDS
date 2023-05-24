package learn.basic.leetcode150;

public class LengthOfLastWord {  // still have issues
    public int lengthOfLastWord(String s) {
        //s = "   ab fly me   to   the moon  "

        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != 32) {
                len++;

            } else {
                if (len != 0)
                    break;

            }
        }
        return len;
    }
}
