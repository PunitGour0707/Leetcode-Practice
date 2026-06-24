/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] ino, int[] pos) {
        if(ino.length==1) return new TreeNode(ino[0]);
        int n=ino.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
             mp.put(ino[i],i);
        }
        return solver(ino,pos,0,n-1,0,n-1,mp);
    }
    public TreeNode solver(int[] ino,int[] pos,int inos,int inoe,int poss,int pose,HashMap<Integer,Integer> mp){
            if(inos>inoe || poss>pose) return null;

            TreeNode root=new TreeNode(pos[pose]);
            int idx=mp.get(pos[pose]);
            int ls=idx-inos;
            root.left=solver(ino,pos,inos,idx-1,poss,poss+ls-1,mp);
            root.right=solver(ino,pos,idx+1,inoe,poss+ls,pose-1,mp);
            return root;
    }
}