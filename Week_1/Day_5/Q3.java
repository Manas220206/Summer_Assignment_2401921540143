class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        int n=strs.length;
        if(n==1)return strs[0];
        int min=strs[0].length();
        if(min==0)return "";
        for(int i=1;i<n;i++){
            min=Math.min(min,strs[i].length());
        }
        for(int i=0;i<min;i++){
            boolean f=true;
            char ch=strs[0].charAt(i);
        for(int j=1;j<n;j++){
            if(strs[j].charAt(i)!=ch){f=false;break;}
        }
        if(f)sb.append(ch);
        else break;
    } 
return sb.toString();}
}