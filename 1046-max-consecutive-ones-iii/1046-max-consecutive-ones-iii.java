class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxLen=0;
    //     for(int i=0;i<n;i++){
    //         int zeroes=0;
    //         for(int j=i;j<n;j++){
    //             if(nums[j]==0) zeroes++;
    //             if(zeroes<=k) maxLen=Math.max(maxLen,j-i+1);
    //             else break;
    //         }
    //     }
    //    return maxLen;
      int zero = 0,j=0,size=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero++;
            while (zero > k) {
                if (nums[j] == 0) {
                    zero--;
                }
                j++;
            }
            size = Math.max(size, i-j+1);
        }
        return size;
    }
}