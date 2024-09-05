class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m=rolls.length;
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=rolls[i];
        }
        int total=mean*(m+n);
        int diff=total-sum;
        if(diff<n || diff>n*6){
            return new int[0];
        }
        int quotient=diff/n;
        int rem=diff%n;
        int [] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=quotient;
        }
        for(int i=0;i<rem;i++){
            result[i]++;
        }
        return result;
    }
}