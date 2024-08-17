class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int n=nums.length;
        int [] a=new int [n];
        // for(int i=nums.length-1;i>=0;i--){
        //     st.push(nums[i]);
        // }
        for(int i=2*n-1;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx]){
                st.pop();
            }
            if(st.isEmpty()){
                a[idx]=-1;
            }else{
                a[idx]=st.peek();
            }
            st.push(nums[idx]);
        }
        return a;
    }
}