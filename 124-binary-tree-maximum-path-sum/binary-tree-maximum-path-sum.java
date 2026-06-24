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
    static int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
         ans=Integer.MIN_VALUE;
        finder(root);
        return ans;
    }
    public int finder(TreeNode root){
        if(root==null) return 0;
        int lsum=finder(root.left);
        int rsum=finder(root.right);
        ans=Math.max(ans,root.val+lsum+rsum);
        int x=root.val+Math.max(lsum,rsum);
        if(x<0)x=0;
        return x;
    }
}