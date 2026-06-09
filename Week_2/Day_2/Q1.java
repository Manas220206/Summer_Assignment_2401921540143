class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr=new int[128];
        Arrays.fill(arr,-1);
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(arr[ch]>=left){
                left=arr[ch]+1;
            }
            arr[ch]=right;
            max=Math.max(max,right-left+1);
        }
    return max;}
}