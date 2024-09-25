class Solution {
    public static int fun(int []nums,int goal){
        if(goal<0)return 0;
        int l=0,r=0,sum=0,count=0;
        int n=nums.length;
        while(r<n){
            sum+=(nums[r]%2);
            while(sum>goal){
                sum-=(nums[l]%2);
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int ans1=fun(nums,k);
        int ans2=fun(nums,k-1);
        return ans1-ans2;
    }
}