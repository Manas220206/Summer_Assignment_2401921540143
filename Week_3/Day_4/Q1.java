class Solution {
    public int[] nge(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] a=new int[n];
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])st.pop();
            if(!st.isEmpty())a[i]=st.peek();
            st.push(i);
        }
        return a;
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ng=nge(temperatures);
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++){
            if(ng[i]==0)ans[i]=0;
            else ans[i]=ng[i]-i;
        }
    return ans;}
}