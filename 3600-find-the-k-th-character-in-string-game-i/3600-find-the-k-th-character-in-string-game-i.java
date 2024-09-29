class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while (word.length() < k) {
            StringBuilder newPart = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char nextChar = (char) ((word.charAt(i) - 'a' + 1) % 26 + 'a');
                newPart.append(nextChar);
            }
            word.append(newPart);
        }
        return word.charAt(k - 1);
    }
}