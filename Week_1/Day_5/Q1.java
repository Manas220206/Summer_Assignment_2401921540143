class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char st=Character.toLowerCase(s.charAt(i));
            char end=Character.toLowerCase(s.charAt(j));
            if(!Character.isLetterOrDigit(st)){i++;continue;}
            if(!Character.isLetterOrDigit(end)){j--;continue;}
            if(st!=end)return false;
            i++;j--;
        }
    return true;}
}