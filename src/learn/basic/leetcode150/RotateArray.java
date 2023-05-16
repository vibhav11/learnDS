package learn.basic.leetcode150;

public class RotateArray {

    public void rotateRight(int k, int... nums){
        //sample input : nums = [1,2,3,4,5,6,7], k = 3
        while(k>0){
            int first = nums[nums.length-1];
            int tmp;
            for (int i = nums.length-1;i>0; i--) {
//                tmp = nums[i];
                nums[i] = nums[i-1];
            }
            nums[0] = first;
            k--;
        }

    }
    public void rotateRight_v2(int k, int... nums){
        while (k> nums.length) {
            k=k- nums.length;
        }

        int[] tmp = new int[nums.length];
        int j=0;

        for (int i = nums.length-k; i < nums.length; i++) {
            tmp[j] = nums[i];
            j++;
        }

        for (int i = 0; i < nums.length-k; i++) {
            tmp[j] = nums[i];
            j++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i]=tmp[i];
        }
    }
}
