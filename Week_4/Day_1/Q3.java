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
    public boolean check(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null)return true;
        if(r1==null || r2==null)return false;
        if(r1.val!=r2.val)return false;
        return check(r1.left,r2.left)&&check(r1.right,r2.right); 
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p,q);
    }
}