class Solution {
    public int findCircleNum(int[][] grid) {
        List<List<Integer>> al = new ArrayList();
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]==1)al.get(i).add(j);
            }
        }
        boolean[] vis = new boolean[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                vis[i]=true;
                cnt++;
                for (int nei : al.get(i)) {
                    // if (!vis[nei]) {
                    if(nei!=i)
                       dfs(grid, al, vis, nei);
                    // }
                }
            }
        }
        return cnt;

    }

    public void dfs(int[][] grid, List<List<Integer>> al, boolean[] vis, int n) {
        if (vis[n]) {
            return;
        }
        vis[n] = true;
        for (int nei : al.get(n)) {
            if (!vis[nei]) {

                dfs(grid, al, vis, nei);
            }
        }
    }
}