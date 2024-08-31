class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);
        StringBuilder key = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            char minDigit = (char) Math.min(Math.min(str1.charAt(i), str2.charAt(i)), str3.charAt(i));
            key.append(minDigit);
        }
        String ans = key.toString().replaceFirst("^0+(?!$)", "");
        int ans1=Integer.parseInt(ans);
        return ans1;
    }
}