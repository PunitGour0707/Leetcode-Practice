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
    List<String> ans;
    public List<String> binaryTreePaths(TreeNode root) {
        ans=new ArrayList<>();
        if(root==null)return ans;
        String cur=(""+root.val);
        solve(root,cur);
        return ans;
    }
    public void solve(TreeNode root,String cur){
        if(root.left==null && root.right==null){
            ans.add(new String(cur));
        }
        if(root.left!=null)solve(root.left,cur+"->"+root.left.val);
        if(root.right!=null)solve(root.right,cur+"->"+root.right.val);
    }
}