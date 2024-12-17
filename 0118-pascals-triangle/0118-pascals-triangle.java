class Solution {
    public static List<Integer> pas(int n){
        long ans=1;
        List<Integer>al=new ArrayList<>();
        al.add(1);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            al.add((int)ans);
        }
        return al;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ans.add(pas(i+1));
        }
        return ans;
    }
}