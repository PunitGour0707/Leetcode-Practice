class Solution {
    public int[][] insert(int[][] arr, int[] x) {
        int n=arr.length;
        List<int[]> ans=new ArrayList<>();
        int i=0;
        while(i<n && x[0]>arr[i][1]){
            ans.add(arr[i]);i++;
        }
        while(i<n && x[1]>=arr[i][0]){
            x[0]=Math.min(x[0],arr[i][0]);
            x[1]=Math.max(x[1],arr[i][1]);
            i++;
        }
        ans.add(x);
        while(i<n){
            ans.add(arr[i]);i++;
        }
        int[][] result = ans.toArray(new int[ans.size()][2]);
        return result;
    }
}