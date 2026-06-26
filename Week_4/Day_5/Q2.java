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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=preorder.length;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=build(preorder,0,n-1,inorder,0,n-1,map);
        return root;
    }
    public TreeNode build(int[] pre,int ps,int pe,int[] in,int is,int ie,HashMap<Integer,Integer> map){
        if(ps>pe||is>ie)return null;
        TreeNode root=new TreeNode(pre[ps]);
        int x=map.get(pre[ps]);
        int n=x-is;
        root.left=build(pre,ps+1,ps+n,in,is,x-1,map);
        root.right=build(pre,ps+n+1,pe,in,x+1,ie,map);
        return root;
    }
}