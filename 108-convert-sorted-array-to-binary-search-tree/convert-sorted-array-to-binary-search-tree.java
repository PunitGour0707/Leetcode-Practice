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
    public TreeNode solve(int[] arr,int l,int h){
        if(l>h)return null;
        int mid=l+((h-l)/2);
        TreeNode cur=new TreeNode(arr[mid]);
        cur.left=solve(arr,l,mid-1);
        cur.right=solve(arr,mid+1,h);
        return cur;
    }
    public TreeNode sortedArrayToBST(int[] arr) {
        return solve(arr,0,arr.length-1);
      
    }
}