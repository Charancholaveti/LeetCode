class Solution {
    public int majorityElement(int[] a) {
    int votes=0;
    int majority=-1;
    for(int i=0;i<a.length;i++){
    if(votes==0){
        majority=a[i];
        votes=1;
    }
    else{
        if(majority==a[i]) votes++;
        else votes--;
    }
   }
   int count=0;
   for(int i=0;i<a.length;i++){
    if (a[i]==majority)
     count++;
    }
    return majority;
    }
}