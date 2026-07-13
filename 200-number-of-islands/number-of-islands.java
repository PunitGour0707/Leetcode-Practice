class Solution {
    public int numIslands(char[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean[][] vis = new boolean[m][n];
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (arr[i][j]=='1' && !vis[i][j]) {
                    cnt++;
                    dfs(i, j, arr, vis);
                }
            }
        }
        return cnt;
    }

    public void dfs(int i, int j, char[][] arr, boolean[][] vis) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == '0' 
                || vis[i][j])
            return;
        vis[i][j] = true;
        dfs(i + 1, j, arr, vis);
        dfs(i - 1, j, arr, vis);
        dfs(i, j + 1, arr, vis);
        dfs(i, j - 1, arr, vis);
    }
}