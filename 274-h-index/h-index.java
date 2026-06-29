class Solution {
    public int hIndex(int[] arr) {
        int n=arr.length;
        if(n==1 && arr[0]==0)return 0;
        if(n==1)return 1;
        int ans=0;
        Arrays.sort(arr);
        int i=n-1;
        while(i>=0){
            // if(arr[i]==0) break;
            if(arr[i]<n-i) return n-i-1;
            i--;
        }
        return i==-1?n:0;
    }
}