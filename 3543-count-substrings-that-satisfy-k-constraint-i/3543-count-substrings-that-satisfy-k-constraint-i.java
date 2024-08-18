class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int zeros=0; 
            int ones=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='0') zeros++;
                else ones++;
                if(zeros<=k || ones<=k) ans++;
            }
        }
        return ans;
    }
}