class Solution {
    public int[] twoSum(int[] a, int target) {
        // for(int i=0;i<a.length-1;i++){
        //     for(int j=i+1;j<a.length;j++){
        //         if (a[i]+a[j]==target) {
        //             return new int[]{i,j};}

        //     }
        // }
        // return null ;
        int n = a.length;
        HashMap<Integer,Integer>hp=new HashMap<>();
        int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<n;i++){
            int rem=target-a[i];
            if(hp.containsKey(rem)){
                ans[0]=hp.get(rem);
                ans[1]=i;
                return ans;
            }
            hp.put(a[i],i);
        }
        return ans;
    }
}