/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public TreeNode node(String[] s,int i){
        if(s[i].equals("#") ||s[i].equals(""))return null;
        return  new TreeNode(Integer.parseInt(s[i]));
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){sb.append("#,");
            continue;}
            sb.append(curr.val);
            sb.append(",");
            q.add(curr.left);
            q.add(curr.right);
        }
    return sb.toString();}

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0)return null;
        String[] s=data.split(",");
        int i=0;
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode root=node(s,i++);
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null) continue;
            if(i<s.length){
                curr.left=node(s,i++);
                q.add(curr.left);
            }
            if(i<s.length){
                curr.right=node(s,i++);
                q.add(curr.right);
            }
        }
        return root;}
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));