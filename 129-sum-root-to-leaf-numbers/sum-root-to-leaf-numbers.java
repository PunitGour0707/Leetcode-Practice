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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        finder(root,0);
        return ans;
    }
    public void finder(TreeNode root,int val){
        if(root.left==null && root.right==null){
            ans+=val*10+root.val;
            return;
        }
        if(root.left!=null) finder(root.left,val*10+root.val);
        if(root.right!=null) finder(root.right,val*10+root.val);
    }
}