class Solution {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char st=s[i];
            char end=s[j];
            s[i++]=end;s[j--]=st;
        }
    }
}