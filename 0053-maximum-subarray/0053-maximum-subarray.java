class Solution {
    public int maxSubArray(int[] nums) {
        // int current_sum=0;
        // int max_sum=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     current_sum=Math.max(nums[i],current_sum+nums[i]);
        //     //if(current_sum<0) current_sum=0;
        //     max_sum=Math.max(current_sum,max_sum);
        // }
        // return max_sum;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxi=Math.max(maxi,sum);
            if(sum<0)sum=0;
        }
        return maxi;
    }
}