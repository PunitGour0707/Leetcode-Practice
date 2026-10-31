class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int cur=dfs(grid,i,j);
                    max=Math.max(max,cur);
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i ,int j){
       if(i>=grid.length || j>=grid[0].length|| i<0 ||j<0 || grid[i][j]==0)return 0;
       grid[i][j]=0;
       int cur=1;
       cur+=dfs(grid,i-1,j);
       cur+=dfs(grid,i+1,j);
       cur+=dfs(grid,i,j-1);
       cur+=dfs(grid,i,j+1);
       return cur;
    }
}