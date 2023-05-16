package learn.basic.leetcode150;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        //Arrays.sort(nums);
        //return nums[nums.length/2];

        // try for O(n) time complexity
        int prev = nums[0];
        int count = 1;
        int maj_idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[maj_idx])  count++;
            else count--;

            if (count==0){
                maj_idx=i+1;
                count++;
                i++;
            }
        }

        return nums[maj_idx];
    }
}
