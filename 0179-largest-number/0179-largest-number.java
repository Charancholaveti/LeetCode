class Solution {
    public String largestNumber(int[] nums) {
        String [] numbers=new String[nums.length];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(numbers,(a,b)->(b+a).compareTo(a+b));
        if(numbers[0].equals("0")) return "0";
        StringBuilder ans=new StringBuilder();
        for(String str:numbers){
             ans.append(str);
        }
        return ans.toString();
    }
}