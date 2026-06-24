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
    public List<Double> averageOfLevels(TreeNode r) {
        if(r==null)return new ArrayList<>();
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(r);
        while(!q.isEmpty()){
            int n=q.size();
            double s=0;
            for(int i=0;i<n;i++){
                TreeNode t=q.poll();
                s+=t.val;
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
            }
            ans.add((double)(s/n));
        }
        return ans;
    }
}