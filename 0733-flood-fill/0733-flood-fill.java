class Solution {
    public int[][] floodFill(int[][] grid, int sr, int sc, int c) {
        if(grid[sr][sc]==c)return grid;
        solve(grid,sr,sc,c,grid[sr][sc]);
        return grid;
    }
    public void solve(int[][] grid,int sr,int sc,int c, int og){
        if(sr<0 ||sc<0 || sr>=grid.length|| sc>=grid[0].length || grid[sr][sc]!=og){
            return;
        }
        grid[sr][sc]=c;
        solve(grid,sr+1,sc,c,og);
        solve(grid,sr-1,sc,c,og);
        solve(grid,sr,sc+1,c,og);
        solve(grid,sr,sc-1,c,og);
    }
}