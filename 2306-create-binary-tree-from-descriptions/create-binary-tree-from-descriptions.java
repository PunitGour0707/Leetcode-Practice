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
    public TreeNode createBinaryTree(int[][] arr) {
        HashMap<Integer,TreeNode> mp=new HashMap<>();
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
           int p=arr[i][0];
           int c=arr[i][1];
           int l=arr[i][2];
           mp.putIfAbsent(p,new TreeNode(p));
           mp.putIfAbsent(c,new TreeNode(c));
           if(l==1){
            mp.get(p).left=mp.get(c);
           }
           else{
            mp.get(p).right=mp.get(c);
           }
           st.add(c);
        }
        for(Map.Entry<Integer,TreeNode> e:mp.entrySet()){
            if(!st.contains(e.getKey()))return e.getValue();
        }
        return null;
    }
}