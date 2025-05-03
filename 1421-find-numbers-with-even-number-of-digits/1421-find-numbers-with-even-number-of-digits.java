class Solution {
    public int findNumbers(int[] nums) {
       int evenCount=0;
       for(int num : nums){
        int n=String.valueOf(num).length();
        if(n%2==0) evenCount++;
       }
       return evenCount; 
    }
}