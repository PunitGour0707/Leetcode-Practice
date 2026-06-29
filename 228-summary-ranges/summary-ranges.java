class Solution {
    public List<String> summaryRanges(int[] arr) {
        int n = arr.length;
        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int s = arr[i];
            int j = i;
            while (i < n - 1 && arr[i + 1] - arr[i] == 1)
                i++;
            int end = arr[i ];
            StringBuilder sb = new StringBuilder("");
            if (s == end) {
                ans.add(sb.append(s).toString());
            } else {
                ans.add(sb.append(s).append("->").append(end).toString());
            }
            i++;
        }
        return ans;
    }
}