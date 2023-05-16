package learn.junit;

import junit.framework.TestCase;
import learn.basic.leetcode150.RotateArray;
import org.junit.Assert;
import org.junit.Test;

//import org.junit.Assert.assertArrayEquals;

public class TestArrayRotation extends TestCase {

    RotateArray ra = new RotateArray();

    @Test
    public void test3RightRotations(){
        int[] nums = {1,2,3,4,5,6,7};
        int[] expected = {5,6,7,1,2,3,4};
        ra.rotateRight(3,nums);
        Assert.assertArrayEquals(expected,nums);
    }
    @Test
    public void test2RightRotations(){
        //nums = [-1,-100,3,99], k = 2
        int[] nums = {-1,-100,3,99};
        int[] expected = {3,99,-1,-100};
        ra.rotateRight(2,nums);
        Assert.assertArrayEquals(expected,nums);
    }

    @Test
    public void test3RightRotations_v2(){
        int[] nums = {1,2,3,4,5,6,7};
        int[] expected = {5,6,7,1,2,3,4};
        ra.rotateRight_v2(3,nums);
        Assert.assertArrayEquals(expected,nums);
    }

    public void test2RightRotations_v2(){
        //nums = [-1,-100,3,99], k = 2
        int[] nums = {-1,-100,3,99};
        int[] expected = {3,99,-1,-100};
        ra.rotateRight_v2(2,nums);
        Assert.assertArrayEquals(expected,nums);
    }
}
