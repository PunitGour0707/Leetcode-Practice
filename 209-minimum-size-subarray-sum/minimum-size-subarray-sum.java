class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int ans = 0;
        int n = arr.length;
        int l = 0, r = 0;
        int sum = 0;
        while (r < n) {
            sum += arr[r];
            while (sum >= k) {
                if (ans == 0)
                    ans = r - l + 1;
                else
                    ans = Math.min(ans, r - l + 1);
                sum -= arr[l];
                l++;
            }
            r++;
        }
        return ans;
    }
}