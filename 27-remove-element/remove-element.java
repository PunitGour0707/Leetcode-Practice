class Solution {
    public int removeElement(int[] arr, int val) {

        int n=arr.length;
        int i=0;
        int j=n-1;
        int k=0;
        while(i<=j){
            if(arr[j]==val) j--;
            else if(arr [j]!=val &&  arr[i]==val ){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;i++;
                k++;
            }
            else if(arr[i]!=val){
                i++;
                k++;
            }
        }
        return k;
    }
}