class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length;
        int n=arr[0].length;
        int low=0;
        int high=(m*n)-1;int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(target==arr[mid/n][mid%n]) return true;
            else if(target>arr[mid/n][mid%n]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}