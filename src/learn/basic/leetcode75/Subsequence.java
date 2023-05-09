package learn.basic.leetcode75;
public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        int startingPoint=0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = startingPoint; j < t.length(); j++) {
                if(s.charAt(i)==t.charAt(j)){
                    startingPoint=j+1;
                    break;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
