class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        long ans=0;
        int i=0,j=n-1;
        while(i<j){
            ans+=(arr[j]-arr[i]);
            i++;
            j--;
        }
        if(n%2==1){
            ans+=arr[i];
        }
        return ans;
    }
}