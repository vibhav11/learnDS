package learn.basic.leetcode150;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j=0,k=0;
        int[] newNums= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                //k++;
                newNums[k++]=nums[i];
            }
        }
        for (int i = 0; i < k; i++) {
            nums[i]=newNums[i];
        }
        return k;
    }

    //better solution
    /*public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }*/
}
