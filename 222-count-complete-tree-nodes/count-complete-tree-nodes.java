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
    int ans=0;
     public int findlh(TreeNode root){
        if(root==null) return 0;
        int cnt=1;
        while(root.left!=null){
            cnt++;
            root=root.left;
        }
        return cnt;
    }
    public int findrh(TreeNode root){
        if(root==null) return 0;
        int cnt=1;
        while(root.right!=null){
            cnt++;
            root=root.right;
        }
        return cnt;
    }
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int lh=findlh(root);
        int rh=findrh(root);
        if(rh==lh) {
            return (int)Math.pow(2,lh)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);

    }
}