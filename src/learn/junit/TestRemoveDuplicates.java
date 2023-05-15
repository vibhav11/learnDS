package learn.junit;

import junit.framework.TestCase;
import learn.basic.leetcode150.RemoveDuplicates;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRemoveDuplicates extends TestCase {

        RemoveDuplicates rd = new RemoveDuplicates();
        int[] list1 = {-3,-1,0,0,0,3,3}; //6
        int[] expectedList1 = {-3,-1,0,0,3,3};
        int[] list2 = {1,1,1,2,2,3}; //5
        int[] expectedList2 = {1,1,2,2,3};
        int[] list3 = {0,0,0,0,0,1,1,2,2,3,3,3,3};//8
    int[] expectedList3 = {0,0,1,1,2,2,3,3};

    @Test
    public void test1(){
        int k = rd.removeDuplicates_v2(list1);
        assert k == expectedList1.length;
        for (int i = 0; i < k; i++) {
            assert list1[i] == expectedList1[i];
        }
    }

    @Test
    public void test2(){
        int k = rd.removeDuplicates_v2(list2);
        assert k == expectedList2.length;
        for (int i = 0; i < k; i++) {
            assert list2[i] == expectedList2[i];
        }
    }

    @Test
    public void test3(){
        int k = rd.removeDuplicates_v2(list3);
        assert k == expectedList3.length;
        for (int i = 0; i < k; i++) {
            assert list3[i] == expectedList3[i];
        }
    }
}
