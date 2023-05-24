package learn.basic.leetcode75;


/*     Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
 */
public class RomanToInteger {
    /*public int romanToInt(String s) { //s = "MCMXCIV"
        int num = 0;
        int j = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            j=i+1;
            if (s.charAt(i) == 'I' && (s.charAt(j) == 'V' || s.charAt(j) == 'X')) {
                if (s.charAt(j) == 'V') {
                    num = num + 4;
                    i++;
                } else if(s.charAt(j) == 'X'){
                    num = num + 9;
                    i++;
                }else{
                    num=num+1;
                }
            }
            if (s.charAt(i) == 'X' && (s.charAt(j) == 'L' || s.charAt(j) == 'C')) {
                if (s.charAt(j) == 'L') {
                    num = num + 40;
                    i++;
                } else if(s.charAt(j) == 'C'){
                    num = num + 90;
                    i++;
                }else{
                    num=num+10;
                }
            }
            if (s.charAt(i) == 'C' && (s.charAt(j) == 'D' || s.charAt(j) == 'M')) {
                if (s.charAt(j) == 'D') {
                    num = num + 400;
                    i++;
                } else if(s.charAt(j) == 'M'){
                    num = num + 900;
                    i++;
                }else{
                    num=num+100;
                }
            }

        }
    } */

    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) {
                ans -= num;
            } else {
                ans += num;
            }
        }
        return ans;
    }
}
