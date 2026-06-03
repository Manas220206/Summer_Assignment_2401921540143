class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                arr[i]=nums[j];
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    return ;}
}