class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis=new boolean[rooms.size()];
        int n=rooms.size();
        dfs(0,rooms,vis);
        for(boolean x:vis){
            if(!x)return false;
        }
        return true;
    }
    public void dfs(int i,List<List<Integer>> rooms,boolean[] vis){
        vis[i]=true;
        for(int x: rooms.get(i)){
            if(!vis[x])dfs(x,rooms,vis);
        }
    }
}