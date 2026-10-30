class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vis=new boolean[n];
        return dfs(graph,vis,s,d);
    }
    public boolean dfs(List<List<Integer>> g,boolean[] vis,int s ,int d){
        if(s==d)return true;
        vis[s]=true;
        for(int x:g.get(s)){
            if(!vis[x]){
                if(dfs(g,vis,x,d))return true;
            }
        }
        return false;
    }
}