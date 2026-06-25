class Solution {
    public int searchInsert(int[] arr, int k) {
        int n=arr.length;
        int ans=n;
        int low=0;
        int high=n-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]>=k){
                ans=mid;
                high=mid-1;
            }
            else  low=mid+1;

        }
        return ans;
    }
}