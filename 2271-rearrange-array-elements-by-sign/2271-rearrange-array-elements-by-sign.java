class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pIndex=0;
        int nIndex=1;
        int n=nums.length;
        int [] ans=new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[nIndex]=nums[i];
                nIndex+=2;
            }
            else{
                ans[pIndex]=nums[i];
                pIndex+=2;
            }
        }
        return ans;
    }
}