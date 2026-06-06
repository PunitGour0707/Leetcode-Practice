class Solution {
    public int[] leftRightDifference(int[] arr) {
        int n=arr.length;
        int l=0;
        int r=0;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            r+=arr[i];
        }
        
        for(int i=0;i<n;i++){
            r-=arr[i];
            ans[i]=Math.abs(r-l);
            
            l+=arr[i];
        }
        return ans;
    }
}