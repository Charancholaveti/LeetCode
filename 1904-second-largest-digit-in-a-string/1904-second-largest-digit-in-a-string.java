class Solution {
    public int secondHighest(String s) {
        int largest =-1;
        int secondlargest =-1;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                int digit =  c-'0';
                if(digit >largest){
                    secondlargest = largest;
                    largest = digit;
                }
                else if(digit<largest && digit>secondlargest){
                    secondlargest = digit;
                }
            }
        }
        return secondlargest;
    }
}