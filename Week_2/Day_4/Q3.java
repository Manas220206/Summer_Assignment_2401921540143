class Solution {
    public void help(String s,int c,int o,int n,List<String> ans){
        if(o+c==2*n){
            ans.add(s);
            return;
        }
        if(o<n)help(s+"(",c,o+1,n,ans);
        if(c<o)help(s+")",c+1,o,n,ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        help("",0,0,n,ans);
        return ans;
    }
}