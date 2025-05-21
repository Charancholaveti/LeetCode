class Solution {
    public int missingNumber(int[] arr) {
        int xor=arr.length;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i]^i;
        }
       return xor; 
    }
}