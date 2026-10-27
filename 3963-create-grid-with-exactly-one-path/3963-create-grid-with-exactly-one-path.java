class Solution {
    public String[] createGrid(int m, int n) {
        String[][] ans=new String[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    ans[i][j]=".";
                }
                else if(j==n-1){
                    ans[i][j]=".";
                }
                else {
                    ans[i][j]="#";
                }
            }
        }
        String[] ansf=new String[m];
        for(int i=0;i<m;i++){
            ansf[i]=String.join("",ans[i]);
        }
        return ansf;
    }
}