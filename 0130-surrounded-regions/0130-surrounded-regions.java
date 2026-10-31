class Solution {
    public void solve(char[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 ||i==m-1 || j==0 ||j==n-1){
                    if(arr[i][j]=='O'){
                        dfs1(arr,i,j);
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]=='O') dfs2(arr,i,j);
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             if(arr[i][j]=='1') arr[i][j]='O';
            }
         }
    }
    public void dfs1(char[][] arr ,int i,int j){
        if(i>=arr.length|| j>=arr[0].length ||i<0||j<0|| arr[i][j]!='O' )return;
        arr[i][j]='1';
        dfs1(arr,i-1,j);
        dfs1(arr,i+1,j);
        dfs1(arr,i,j-1);
        dfs1(arr,i,j+1);
    }
     public void dfs2(char[][] arr ,int i,int j){
        if(i>=arr.length|| j>=arr[0].length ||i<0||j<0|| arr[i][j]!='O')return;
        arr[i][j]='X';
        dfs2(arr,i-1,j);
        dfs2(arr,i+1,j);
        dfs2(arr,i,j-1);
        dfs2(arr,i,j+1);
    }
}