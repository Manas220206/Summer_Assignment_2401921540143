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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        int x=targetSum-root.val;
        if(x==0 && root.left==null && root.right==null)return true;
        boolean l=false;boolean r=false;;
        l= hasPathSum(root.left,x);
        r= hasPathSum(root.right,x);
        return l||r;
    }
}