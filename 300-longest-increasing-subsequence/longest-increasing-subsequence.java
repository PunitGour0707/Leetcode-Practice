class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0,-1,arr,n,dp);
    }
    public int f(int i,int pi,int[] arr,int n,int[][] dp){
        if(i>n-1)return 0;
        if(dp[i][pi+1]!=-1)return dp[i][pi+1];
        int len=0+f(i+1,pi,arr,n,dp);
        if(pi==-1|| arr[i]>arr[pi]){
            len=Math.max(len,1+f(i+1,i,arr,n,dp));
        }
        return dp[i][pi+1]=len;
    }
}