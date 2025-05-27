class Solution {
    public boolean checkValidString(String s) {
        int mini=0;
        int maxi=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                mini++;
                maxi++;
            }
            else if(s.charAt(i)==')'){
                mini--;
                maxi--;
            }else{
                mini--;
                maxi++; 
            }
            if(mini<0) mini=0;
            if(maxi<0) return false;
        }
        return mini==0;
    }
}