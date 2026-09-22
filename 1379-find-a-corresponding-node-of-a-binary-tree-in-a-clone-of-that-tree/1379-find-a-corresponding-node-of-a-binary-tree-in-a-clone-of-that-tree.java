/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode o, final TreeNode c, final TreeNode t) {
        // ans=null;
        solve(o,c,t);
        return ans;
    }
    public void solve(TreeNode o,TreeNode c, TreeNode t){
        if(c==null)return;
        if(c.val==t.val){
            ans=c;
            return;
        }
        solve(o,c.left,t);
        solve(o,c.right,t);

    }
}