package learn.junit;

import junit.framework.TestCase;
import learn.basic.leetcode75.RomanToInteger;
import org.junit.Test;

public class TestRomanToInteger extends TestCase {

    @Test
    public void testMCMXCIV(){
        String s = "MCMXCIV";
        RomanToInteger rti = new RomanToInteger();
        assertEquals(1994,rti.romanToInt(s));
    }

    @Test
    public void testI(){
        String s = "I";
        RomanToInteger rti = new RomanToInteger();
        assertEquals(1,rti.romanToInt(s));
    }
    @Test
    public void testIII(){
        String s = "III";
        RomanToInteger rti = new RomanToInteger();
        assertEquals(3,rti.romanToInt(s));
    }
}
