class Solution {
    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        int n=arr.length;
        int m=arr[0].length;;
        for(int i=0;i<k;i++){
            shift(arr);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<m;j++){
            temp.add(arr[i][j]);

               }
            ans.add(temp);
        }
        return ans;
    }
    public void shift(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[] lcol=new int[n];
        for(int i=0;i<n;i++){
            lcol[i]=arr[i][m-1];
        }
        int temp=lcol[n-1];
        for(int i=n-1;i>=1;i--){
            lcol[i]=lcol[i-1];
        }
        lcol[0]=temp;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>0;j--){{
                arr[i][j]=arr[i][j-1];  
                          }
            
            }
        }
        for(int i=0;i<n;i++){
            arr[i][0]=lcol[i];
        }

        
    }
}