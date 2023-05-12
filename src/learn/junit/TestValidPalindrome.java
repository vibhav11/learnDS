package learn.junit;

import junit.framework.TestCase;
import learn.basic.leetcode150.ValidPalindrome;
import org.junit.Before;
import org.junit.Test;

public class TestValidPalindrome extends TestCase {
    String s1;
    String s2;
    String s3;
    ValidPalindrome val;
    @Before
    public void setUp() {
        s1 = "A man, a plan, a canal: Panama";
        s2 = "race a car";
        s3 = " ";
        val = new ValidPalindrome();
    }

    @Test
    public void test2(){
        assertFalse(val.isPalindrome(s2));
    }

    @Test
    public void test1(){
        assertTrue(val.isPalindrome(s1));
    }

    @Test
    public void test3(){
        assertTrue(val.isPalindrome(s3));
    }

    public void tearDown(  ) {
    }

}
