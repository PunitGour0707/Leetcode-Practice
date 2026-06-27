class Solution {
    public int minDistance(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){Arrays.fill(dp[i],-1);

        }
        return solve(n-1,m-1,s1,s2,dp);
    }
    public int solve(int i,int j,String s1,String s2,int[][] dp){
        if(i<0)return j+1;
        if(j<0)return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=0+solve(i-1,j-1,s1,s2,dp);
            return dp[i][j];
        }
        int remove=1+solve(i-1,j,s1,s2,dp);
        int replace=1+solve(i-1,j-1,s1,s2,dp);
        int insert=1+solve(i,j-1,s1,s2,dp);
        return dp[i][j]=Math.min(replace,(Math.min(insert,remove)));
    }
}