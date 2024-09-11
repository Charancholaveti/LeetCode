class Solution {
    public int minBitFlips(int start, int goal) {
        int result=start^goal;
        int count=0;
        while(result!=0){
           count++;
           result=(result&(result-1));
        }
        return count;
    }
}