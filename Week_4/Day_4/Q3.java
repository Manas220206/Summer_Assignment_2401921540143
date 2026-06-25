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
    int answer=Integer.MIN_VALUE;
    public int sum(TreeNode node){
        if(node==null)return 0;
        int lsum=Math.max(0,sum(node.left));
        int rsum=Math.max(0,sum(node.right));

        answer=Math.max(answer,node.val+lsum+rsum);
        return node.val +Math.max(lsum,rsum);
    }

    public int maxPathSum(TreeNode root) {
        sum(root);
        return answer;
    }
}