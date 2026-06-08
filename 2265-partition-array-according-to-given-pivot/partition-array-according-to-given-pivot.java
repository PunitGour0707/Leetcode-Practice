class Solution {
    public void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public int[] pivotArray(int[] arr, int p) {
        int n=arr.length;
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]<p)l1.add(arr[i]);
            else if(arr[i]>p)l2.add(arr[i]);
            else cnt++;
        }
        int i=0;
        while(i<l1.size()){
            arr[i]=l1.get(i);
            i++;
        }
        while(i<l1.size()+cnt){
            arr[i]=p;
            i++;
        }
        while(i<l1.size()+l2.size()+cnt){
            arr[i]=l2.get(i-l1.size()-cnt);
            i++;
        }

        return arr;
        
    }
}