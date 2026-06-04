class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0;
        int j=mat[0].length-1;
        int sum=0;
        for(int k=0;k<mat.length;k++){
            if(i!=j){
                sum+=mat[k][i]+mat[k][j];
                i++;j--;
            }
            else{
                sum+=mat[k][i];
                i++;j--;
            }
        }
    return sum;}
}