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
        int n=0;
        Queue<TreeNode> q=new ArrayDeque<>();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            int x=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<x;i++){
                TreeNode top=q.poll();
                if(n%2==0)temp.add(top.val);
                else temp.add(0,top.val);
                if(top.left!=null)q.add(top.left);
                if(top.right!=null)q.add(top.right);
            }
            n++;
            ans.add(temp);
        }
    return ans;}
}