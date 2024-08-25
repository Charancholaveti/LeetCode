class Solution {
    public static int helper(int [] nums){
        int mini=0;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                mini=i;
            }
        }
        return mini;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int idx=helper(nums);
            nums[idx]*=multiplier;
        }
        return nums;
    }
}