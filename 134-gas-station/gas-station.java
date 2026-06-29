class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tot = 0, cur = 0, s = 0;
        for (int i = 0; i < n; i++) {
            int d = -cost[i] + gas[i];
            tot += d;
            cur += d;
            if (cur < 0) {
                s = i + 1;
                cur = 0;
            }
        }

        return tot < 0 ? -1 : s;
    }
}