class Solution {
    public int missingNumber(int[] a) {
     int xor=a.length;
    for(int i=0;i<a.length;i++){
        xor=xor^a[i]^i;
    }
    return xor;
   }
}   