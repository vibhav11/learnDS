package learn.basic.leetcode150;

import java.util.*;

public class RemoveDuplicates {
    public void removeDuplicates(int[] nums) {
       // int[] nums= {0,0,1,2,3,3,4,5,5,5,6,7};

        int j=0;
        LinkedHashSet<Integer> al=new LinkedHashSet<Integer>();
        for(int i:nums){
            al.add(i);
        }
        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext()){
            nums[j++]=itr.next();
        }
        int duplicates = nums.length-j;
        System.out.println("duplicates:"+duplicates);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    //Input: nums = [0,1,1,1,2,2,2,2,3,3]
    //Output: 7, nums = [0,1,1,2,2,3,3,_]
    public int removeDuplicates_v2(int[] nums){

        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i : nums) {
            if(map.containsKey(i))
                map.compute(i,(k,v)-> v+1);
            else
                map.put(i,1);
        }

        System.out.println("map size:"+ map.size());

        int j=0;
        for (int key : map.keySet()) {
            int value = map.get(key);
            if(value==1){
                nums[j] = key;
                j++;
            }else {
                nums[j]=key;
                nums[j+1]=key;
                j=j+2;
            }

        }

        System.out.println("unique elements:"+j);
        return j;

    }
}
