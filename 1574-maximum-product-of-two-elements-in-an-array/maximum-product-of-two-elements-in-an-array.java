class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int m=Math.max(arr[1],arr[0]);
        int sm=Math.min(arr[1],arr[0]);
        for(int i=2;i<n;i++){
          if(arr[i]>=m){
            sm=m;
            m=arr[i];
          }
          else if(arr[i]>sm){
            sm=arr[i];
          }
        }
        return (m-1)*(sm-1);
    }
}