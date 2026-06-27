class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(arr,n-1,dp);
    }
    public int solve(int[] arr,int i,int[] dp){
        if(i==0) return arr[i];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick=arr[i]+solve(arr,i-2,dp);
        int notpick=0+solve(arr,i-1,dp);
        dp[i]=Math.max(pick,notpick);
        return dp[i];
    }
}