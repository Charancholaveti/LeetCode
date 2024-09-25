class Solution {
    public static int fun(int []nums,int goal){
        if(goal<0)return 0;
        int l=0,r=0,sum=0,count=0;
        int n=nums.length;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans1=fun(nums,goal);
        int ans2=fun(nums,goal-1);
        return ans1-ans2;
    }
}