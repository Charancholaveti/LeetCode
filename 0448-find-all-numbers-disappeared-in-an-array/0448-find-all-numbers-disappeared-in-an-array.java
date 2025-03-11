class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        HashSet<Integer>hs=new HashSet<>();
          for(int val:arr){
             hs.add(val);
          }
          List<Integer>al=new ArrayList<>();
          int n=arr.length;
          for(int i=1;i<=n;i++){
             if(hs.contains(i)==false)
              al.add(i);
        
          }
          return al;
    }
}