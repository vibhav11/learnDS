package learn.junit;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestJunit extends TestCase {
    @Test
    public void testAdd() {
        //test data

        int num = 5;
        String temp = "ab";
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 6);

        //check for not null value
        assertNotNull(temp);
    }
}
