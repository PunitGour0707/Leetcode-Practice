class Solution {
    public int jump(int[] arr) {
        int j=0;
        int n=arr.length;
        int l=0,r=0;
        while(r<n-1){
           int farthest=0;
           for(int i=l;i<=r;i++){
            farthest=Math.max(farthest,i+arr[i]);
           }
           l=r+1;
           r=farthest;j++;
        }
        return j;
        
    }
}