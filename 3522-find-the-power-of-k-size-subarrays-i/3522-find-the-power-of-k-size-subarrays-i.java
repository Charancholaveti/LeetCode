class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] result = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            boolean isValid = true;
            
            for (int j = i + 1; j < i + k; j++) {
                if (nums[j] != nums[j - 1] + 1) {
                    isValid = false;
                    break;
                }
            }
            
            result[i] = isValid ? nums[i + k - 1] : -1;
        }
        
        return result;

    }
}