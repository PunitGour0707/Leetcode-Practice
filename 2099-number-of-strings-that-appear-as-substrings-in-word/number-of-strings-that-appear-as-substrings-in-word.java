class Solution {
    public int numOfStrings(String[] arr, String s) {
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.contains(arr[i]))cnt++;
        }
        return cnt;
    }
}