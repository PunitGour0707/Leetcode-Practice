class Solution {
    public int minMoves(int[] arr) {
        int n=arr.length;
        int mini=arr[0];
        for(int i=0;i<n;i++){
            mini=Math.min(mini,arr[i]);
        }
        int ans=0;
        for(int i=n-1;i>=0;i--){
            ans+=arr[i]-mini;
        }
        return ans;
        
    }
}