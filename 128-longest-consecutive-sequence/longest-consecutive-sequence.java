class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int max = 1;
        if(arr.length==0) return 0;
        int curr = arr[0];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            
             if (arr[i ] == curr+1) {
                count++;
                max = Math.max(max, count);
                curr=arr[i];
            } 
            else if(arr[i]==curr){
                continue;
            }
            else if (arr[i ] != curr+1) {
                count = 1;
                curr = arr[i ];
            }
            
        }
        return max;
    }
}