package learn.junit;

import junit.framework.TestCase;
import learn.basic.leetcode150.MajorityElement;
import org.junit.Test;

public class TestMajorityElement extends TestCase {

    MajorityElement me = new MajorityElement();
    int[] arr1 = {3,2,3};
    int[] arr2 = {2,2,1,1,1,2,2};
    @Test
    public void test1(){
        assertEquals(3,me.majorityElement(arr1));
    }

    @Test
    public void test2(){
        assertEquals(2,me.majorityElement(arr2));
    }
}
