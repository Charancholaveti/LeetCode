class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       Arrays.sort(nums);
       int ans[]=new int[2];
       int j=0;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            ans[j]=nums[i];
            j++;
        }
       }
       return ans;
    }
}