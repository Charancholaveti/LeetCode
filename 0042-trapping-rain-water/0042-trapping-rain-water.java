class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int [] prefix=new int[n];
        int [] suffix=new int[n];
        prefix[0]=height[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        suffix[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.min(prefix[i],suffix[i])-height[i];
        }
        return res;
        //  int n = height.length;
        // int left = 0, right = n - 1;
        // int res = 0;
        // int maxLeft = 0, maxRight = 0;
        // while (left <= right) {
        //     if (height[left] <= height[right]) {
        //         if (height[left] >= maxLeft) {
        //             maxLeft = height[left];
        //         } else {
        //             res += maxLeft - height[left];
        //         }
        //         left++;
        //     } else {
        //         if (height[right] >= maxRight) {
        //             maxRight = height[right];
        //         } else {
        //             res += maxRight - height[right];
        //         }
        //         right--;
        //     }
        // }
        // return res;
    }
}