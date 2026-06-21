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
    public boolean hasPathSum(TreeNode root, int ts) {
        if(root==null){
             return false;
        }
        return (finder(root,ts));
    }
    public boolean finder(TreeNode root,int ts){
        if(root==null) return false;
        // if(root.left==null && root.right==null ){
        //  if(root.val-ts==0) return true;
        //  else return false;
        // }
        boolean c;
        if( root.left==null && root.right==null &&ts-root.val==0) c=true;
        else c=false;
        boolean l=finder(root.left,ts-root.val);
        boolean r=finder(root.right,ts-root.val);
        return c||l||r;
    }
}