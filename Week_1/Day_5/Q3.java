import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while((top<=bottom)&&(left<=right)){
            int i=left;int j=right;
            while(i<=j){
                ans.add(matrix[top][i]);
                i++;
            }
            top++;
            i=top;j=bottom;
            while(i<=j){
                ans.add(matrix[i][right]);
                i++;
            }
            right--;
            i=right;j=left;
            if(top<=bottom){
            while(i>=j){
                ans.add(matrix[bottom][i]);i--;
            }
            bottom--;}
            i=bottom;j=top;
            
            if(left<=right){
                while(i>=j){
                ans.add(matrix[i][left]);
                i--;
            }
            left++;}
        }
    return ans;}
}