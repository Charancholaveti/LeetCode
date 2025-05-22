class Solution {
    public int maxSubArray(int[] arr) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxi) maxi=sum;
            if(sum<0) sum=0;
        }
        return maxi;
    }
}