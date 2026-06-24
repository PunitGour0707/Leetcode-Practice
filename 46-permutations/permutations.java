class Solution {
    public List<List<Integer>> permute(int[] arr) {
        int n=arr.length;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        boolean[] taken=new boolean[n];
        solve(arr,ans,sub,taken);
        return ans;
    }
    public void solve(int[] arr,List<List<Integer>> ans,List<Integer> sub,boolean[] taken){
        if(sub.size()==arr.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(taken[i])continue;
            sub.add(arr[i]);
            taken[i]=true;
            solve(arr,ans,sub,taken);
            taken[i]=false;
            sub.remove(sub.size()-1);
        }
    }
}