class Solution {
    public boolean canConstruct(String s, String t) {
        int[] x=new int[26];
        int[] y=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            x[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            y[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(x[i]>y[i])return false;
        }
    return true;
    }
}