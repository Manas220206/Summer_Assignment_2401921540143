class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public int height(TreeNode node){
        if(node==null)return 0;
        int lh=height(node.left);
        int rh=height(node.right);
        return 1+Math.max(lh,rh);
    }
    public int maxDepth(TreeNode root) {
        return height(root);
    }
}