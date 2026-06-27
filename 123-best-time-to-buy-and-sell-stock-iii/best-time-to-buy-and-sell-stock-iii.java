class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int buy=1;
        int[][][] dp=new int[n][2][3];
        for(int i=0;i<n;i++){
            for(int b=0;b<=1;b++){
                
                Arrays.fill(dp[i][b],-1);
            }
        }
        return solve(0,buy,arr,2,dp);
    }
    public int solve(int i,int buy,int[] arr,int cnt,int[][][]dp){
        if(cnt==0 || i==arr.length)return 0;
        if(dp[i][buy][cnt]!=-1)return dp[i][buy][cnt];
        if(buy==1){
            int get=-arr[i]+solve(i+1,0,arr,cnt,dp);
            int nget=0+solve(i+1,1,arr,cnt,dp);
            return dp[i][buy][cnt]=Math.max(get,nget);
        }
        // else
        int sell=arr[i]+solve(i+1,1,arr,cnt-1,dp);
        int nsell=0+solve(i+1,0,arr,cnt,dp);
        return dp[i][buy][cnt]=Math.max(sell,nsell);
    }
}