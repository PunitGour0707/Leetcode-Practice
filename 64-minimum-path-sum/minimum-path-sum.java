class Solution {
    public int minPathSum(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        long[][] dp=new long[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return (int)solve(m-1,n-1,arr,dp);
    }
    public long solve(int i,int j,int[][]arr, long[][] dp){
        if(i==0 && j==0) return arr[i][j];
        if(i<0 ||j<0) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        long left=solve(i-1,j,arr,dp);
        long up=solve(i,j-1,arr,dp);
        dp[i][j]=Math.min(left,up)+arr[i][j];
        return Math.min(left,up)+arr[i][j];
    }
}