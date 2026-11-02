class Solution {
    public int minMoves2(int[] arr) {
        int n=arr.length;
        int idx=n/2;
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.abs(arr[i]-arr[idx]);
        }
        return ans;
    }
}