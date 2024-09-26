class Solution {
    public static int fun(int [] nums,int k){
        HashMap<Integer,Integer>mp=new HashMap<>();
        int l=0,r=0,cnt=0;
        int n=nums.length;
        while(r<n){
            mp.put(nums[r],mp.getOrDefault(nums[r],0)+1);
            while(mp.size()>k){
                mp.put(nums[l],mp.get(nums[l])-1);
                if(mp.get(nums[l])==0)
                    mp.remove(nums[l]);
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return fun(nums,k)-fun(nums,k-1);
    }
}