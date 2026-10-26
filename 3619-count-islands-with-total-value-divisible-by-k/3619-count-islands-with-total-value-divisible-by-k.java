class Solution {
    public int countIslands(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    long cur=dfs(grid,i,j);
                    if(cur%k==0){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public long dfs(int[][] grid,int i, int j){
           if(i>=grid.length|| j>=grid[0].length||i<0||j<0|| grid[i][j]==0) return 0;
           long cur=grid[i][j];
           grid[i][j]=0;
           cur+=dfs(grid,i-1,j);
           cur+=dfs(grid,i+1,j);
           cur+=dfs(grid,i,j-1);
           cur+=dfs(grid,i,j+1);
           return cur;
    }
}