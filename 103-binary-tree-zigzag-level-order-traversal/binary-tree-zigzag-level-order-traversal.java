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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ans=new ArrayList<>();
         if(root==null) return ans;
         Queue<TreeNode> q=new LinkedList<>();
         boolean flag=false;
         q.add(root);
         while(!q.isEmpty()){
            int n=q.size();
            List<Integer> tempans=new ArrayList<>();
            for(int i=0;i<n;i++){
               int val=q.peek().val;
               if(q.peek().left!=null) q.add(q.peek().left);
               if(q.peek().right!=null) q.add(q.peek().right);
               tempans.add(val);
               q.poll();
            }
            if(flag){
                flag=false;
                Collections.reverse(tempans);
            }
            else{
                flag=true;
            }
            ans.add(tempans);
         }
         return ans;
    }
}