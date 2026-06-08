class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int buy=1;
        int[][] dp=new int[n+1][2];
        for(int i=0;i<n+1;i++){

            Arrays.fill(dp[i],-1);
        }
        return solve(0,buy,arr,dp);
    }
    public int solve(int i,int buy,int[] arr,int[][] dp){
        if(i==arr.length) return 0;
        if(dp[i][buy]!=-1)return dp[i][buy];
        int p=Integer.MIN_VALUE;

        if(buy==1){
            int buyThis=-arr[i]+solve(i+1,0,arr,dp);
            int notBuy=0+solve(i+1,1,arr,dp);
            p=Math.max(buyThis,notBuy);
        }
        else{
           int sell=arr[i]+solve(i+1,1,arr,dp);
           int notSell=0+solve(i+1,0,arr,dp);
           p=Math.max(sell,notSell);
        }
        return dp[i][buy]=p;
    }
}