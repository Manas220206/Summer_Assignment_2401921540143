class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String c=tokens[i];
            if(c.equals("+") || c.equals("-") || c.equals("/") || c.equals("*") ){
                int y=st.pop();
                int x=st.pop();
                if(c.equals("+"))st.push(x+y);
                else if(c.equals("-"))st.push(x-y);
                else if(c.equals("/"))st.push(x/y);
                else st.push(x*y);
            }
            else{
                st.push(Integer.parseInt(c));
            }
        }
    return st.pop();}
}