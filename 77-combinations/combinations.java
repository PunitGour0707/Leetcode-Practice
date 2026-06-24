class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        solve(n, k, 1, sub, ans);
        return ans;
    }

    public void solve(int n, int k, int cur, List<Integer> sub, List<List<Integer>> ans) {
        if (sub.size() == k) {
            ans.add(new ArrayList<>(sub));
            return;
        }
        if (cur > n) {
            return;
        }

        sub.add(cur);
        solve(n, k, cur + 1, sub, ans);
        sub.remove(sub.size() - 1);
        solve(n, k, cur + 1, sub, ans);
    }
}