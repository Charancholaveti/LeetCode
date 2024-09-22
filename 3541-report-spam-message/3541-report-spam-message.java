class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int count=0;
        Set<String> bannedSet = new HashSet<>();
        for(String word:bannedWords){
            bannedSet.add(word);
        }
        for(String word:message){
            if(bannedSet.contains(word)) count++;
            if(count>=2) return true;
        }
        return false;
    }
}