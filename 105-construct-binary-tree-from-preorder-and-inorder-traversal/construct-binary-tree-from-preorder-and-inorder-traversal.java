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
    public TreeNode buildTree(int[] pre, int[] ino) {
        if(ino.length==1) return new TreeNode(ino[0]);
        int n=ino.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
             mp.put(ino[i],i);
        }
        return solver(ino,pre,0,n-1,0,n-1,mp);
    }
    public TreeNode solver(int[] ino,int[] pre,int inos,int inoe,int pres,int pree,HashMap<Integer,Integer> mp){
            if(inos>inoe || pres>pree) return null;

            TreeNode root=new TreeNode(pre[pres]);
            int idx=mp.get(pre[pres]);
            int ls=idx-inos;
            root.left=solver(ino,pre,inos,idx-1,pres+1,pres+ls,mp);
            root.right=solver(ino,pre,idx+1,inoe,pres+1+ls,pree,mp);
            return root;
    }
}