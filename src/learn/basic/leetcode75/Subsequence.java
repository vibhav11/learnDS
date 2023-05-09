package learn.basic.leetcode75;
public class Subsequence {
    public boolean isSubsequence(String s, String t) {
        int startingPoint=0;

        for (int i = 0; i < s.length(); i++) {
            boolean match = false;
            for (int j = startingPoint; j < t.length(); j++) {
                if(s.charAt(i)==t.charAt(j)){
                    startingPoint=j+1;
                    match=true;
                    break;
                }
            }
            if (!match)
                return false;
        }
        return true;
    }

    public boolean isSubsequenceTwoPointer(String s,String t){
        int pointer1=0,pointer2=0;
        while(pointer1<s.length() && pointer2<t.length()){
            if (s.charAt(pointer1)==t.charAt(pointer2)){
                pointer1++;
                pointer2++;
            }else{
                pointer2++;
            }
        }
        return pointer1 == s.length();
    }
}
