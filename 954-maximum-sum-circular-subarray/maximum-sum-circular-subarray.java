class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        int mxsum=0,misum=0,t=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            mxsum=Math.max(arr[i],arr[i]+mxsum);
            maxi=Math.max(maxi,mxsum);

            misum=Math.min(arr[i],arr[i]+misum);
            mini=Math.min(mini,misum);

            t+=arr[i];
        }
        if(maxi<0)return maxi;
        return Math.max(maxi,t-mini);
    }
}