class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        // for(int i=0;i<m;i++){
        //    for(int j=0;j<n;j++){
        //     if(i>=0 && j>=0 && arr[i][j]==1) dp[i][j]= 0;
        //     else if(i==0 & j==0) dp[i][j]=1;
        //     else{
        //     int up=0;
        //     int left=0;
        //     if(i>0) up=dp[i-1][j];
        //     if(j>0) left=dp[i][j-1];
        //     dp[i][j]=left+up;
        //     }


        //    }
        // }
        return solve(m-1,n-1,arr,dp);
        //return dp[m-1][n-1];
    }
    public int solve(int i,int j,int[][] arr,int[][] dp){
       if(i<0 ) return 0;
        if(j< 0) return 0;
        if(arr[i][j]==1)return 0;

        if(i==0 && j==0 )return 1;
        
        if(arr[i][j]==1)return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int left=solve(i,j-1,arr,dp);
        int up=solve(i-1,j,arr,dp);
        dp[i][j]=left+up;
        return dp[i][j];

    }
}