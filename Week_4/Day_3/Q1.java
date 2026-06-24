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
    public TreeNode bs(TreeNode root, int x){
        if(root==null)return null;
        if(x==root.val)return root;
        else if(x<root.val) return bs(root.left,x);
        else if(x>root.val)return bs(root.right,x);
        else return null;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return bs(root,val);
    }
}