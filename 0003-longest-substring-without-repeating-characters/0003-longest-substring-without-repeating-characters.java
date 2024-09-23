class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int right=0;
        int maxlen=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        while(right<n){
            if(mp.containsKey(s.charAt(right))) left=Math.max(left,mp.get(s.charAt(right))+1);
            mp.put(s.charAt(right),right);
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}