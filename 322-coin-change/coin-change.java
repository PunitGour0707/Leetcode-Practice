class Solution {
    public int coinChange(int[] coins, int tar) {
        int n=coins.length;
        int[][] dp=new int[n][tar+1];
         for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
     
       
        int ans=solve(n-1,coins,tar,dp);
        if(ans>=(int)1e9) return -1;
        return ans;
    }
    public int solve(int i,int[] arr,int tar,int[][] dp){
        if(i==0){

            if(tar%arr[0]==0) return tar/arr[i];
            // if(tar==0) return
            return (int)1e9;
        }
        if(dp[i][tar]!=-1) return dp[i][tar];
        int notpick=solve(i-1,arr,tar,dp);
        int pick=(int)1e9;
        if(arr[i]<=tar) pick=1+solve(i,arr,tar-arr[i],dp);
        dp[i][tar]=Math.min(pick,notpick);
        return dp[i][tar];
    }
}