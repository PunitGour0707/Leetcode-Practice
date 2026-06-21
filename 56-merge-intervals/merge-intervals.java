class Solution {
    public int[][] merge(int[][] arr) {
        List< int[] > ans= new ArrayList<>();
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(ans.isEmpty() || arr[i][0]>ans.get(ans.size()-1)[1]){
               ans.add(arr[i]);
            }
            else {
               ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],arr[i][1]) ;
            }
        }
        int[][] newans=new int[ans.size()][];
        ans.toArray(newans);
        return newans;
        
    }
}