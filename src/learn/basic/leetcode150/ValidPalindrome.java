package learn.basic.leetcode150;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int frontPointer = 0;
        int rearPointer = s.length()-1;
        while (frontPointer < rearPointer) {
            if (isAlphanumeric(s.charAt(frontPointer)) && isAlphanumeric(s.charAt(rearPointer)) ) {
                if (s.charAt(frontPointer) != s.charAt(rearPointer)) {
                    return false;
                } else {
                    frontPointer++;
                    rearPointer--;
                }
            }
            if (!isAlphanumeric(s.charAt(frontPointer))){
                frontPointer++;
            }
            if (!isAlphanumeric(s.charAt(rearPointer))){
                rearPointer--;
            }

        }
        return true;
    }

    private boolean isAlphanumeric(int ascii){
        if((ascii>=48 && ascii<=57)
                || (ascii>=65 && ascii<=90)
                || (ascii>=97 && ascii<=122)){
            return true;
        }
        return false;
    }
}
