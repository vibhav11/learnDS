import learn.basic.leetcode150.RemoveElement;
import learn.basic.leetcode150.ValidPalindrome;
import learn.basic.leetcode75.IsomorphicStrings;
import learn.basic.leetcode75.ListNode;
import learn.basic.leetcode75.Subsequence;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome! \n");
        ValidPalindrome val = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";

        boolean palindrome = val.isPalindrome(s);

        System.out.println(palindrome);
       // System.out.println(lowerCase);
        /*int[] list1 = {0,1,2,2,3,0,4,2};  // expected [0,1,4,0,3]
        int[] list2 = {1,3,4};
        RemoveElement rm = new RemoveElement();
        int i = rm.removeElement(list1, 2);
        //assert i ==3:true;
        System.out.println(i+"\n");
        printArray(list1);*/

        //SelectionSort s = new SelectionSort();
        //s.sort(arr);
        //printArray(arr);

        /*IsomorphicStrings iso = new IsomorphicStrings();
        boolean isomorphic = iso.isIsomorphic("addga", "eggdf");
        System.out.println(isomorphic);*/

        /*
        Subsequence sub = new Subsequence();
        boolean subsequence = sub.isSubsequence("abc", "fagbtc");
        boolean subsequenceTwoPointer = sub.isSubsequenceTwoPointer("abc", "fagbtc");
        System.out.println("from isSubsequence"+subsequence);
        System.out.println("from isSubsequenceTwoPointer"+subsequenceTwoPointer);
        */


    }
    public  static void printArray(int[] inputArray) {
        // display array elements
        for (int element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }
}