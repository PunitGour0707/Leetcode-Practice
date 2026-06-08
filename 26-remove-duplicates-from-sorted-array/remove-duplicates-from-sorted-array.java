class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int k=0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[k]){
                arr[k+1]=arr[i];
                k=k+1;
            }
        }
        return k+1;
        
    }
}