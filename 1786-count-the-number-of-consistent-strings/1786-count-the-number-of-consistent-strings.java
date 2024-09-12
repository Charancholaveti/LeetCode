class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean [] freq =new boolean[26];
        for(int i=0;i<allowed.length();i++){
            freq[allowed.charAt(i)-'a']=true;
        }
        int count=0;
        for(String s:words){
            int flag=1;
            for(int i=0;i<s.length();i++){
                if(!freq[s.charAt(i)-'a']){
                    flag=0;
                    break;
                }
            }
            count+=flag;
        }
        return count;
    }
}