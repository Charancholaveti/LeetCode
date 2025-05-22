class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans=new int[2];
        ans[0]=ans[1]=-1;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int more=target-num;
            if(hs.containsKey(more)){
                ans[0]=hs.get(more);
                ans[1]=i;
                return ans;
            }
            hs.put(nums[i],i);
        }
        return ans;
    }
}