class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void solver(int[] arr, int idx, int t, List<Integer> sub) {
        if (t < 0)
            return;
        if (t == 0) {
            ans.add(new ArrayList<>(sub));
            return;
        }
        if (idx >= arr.length) {
            if (t == 0)
                ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(arr[idx]);
        solver(arr, idx, t - arr[idx], sub);
        sub.remove(sub.size() - 1);
        solver(arr, idx + 1, t, sub);

    }

    public List<List<Integer>> combinationSum(int[] arr, int t) {
        ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        solver(arr, 0, t, sub);
        return ans;
    }
}