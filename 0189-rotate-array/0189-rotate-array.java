class Solution {
    public static void reverse(int []a,int left,int right){
        while(left<=right){
            int temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] a, int k) {
        int n=a.length;
        k %= a.length;
        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0,n-1);
    }
}