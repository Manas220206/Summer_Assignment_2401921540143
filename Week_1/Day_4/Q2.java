class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans=new int[r][c];
        int x=mat.length;
        int y=mat[0].length;
        if(x*y!=r*c)return mat;
        int total=x*y;
        for(int st=0;st<total;st++){
            ans[st/c][st%c]=mat[st/y][st%y];
        }
    return ans;}
}