class Solution {
    public int maxProfit(int[] a) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<a.length;i++){
            profit=Math.max(profit,a[i]-min);
            min=Math.min(min,a[i]);
        }
        return profit;
    }
}