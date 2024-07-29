//https://leetcode.com/problems/move-zeroes/
class Solution {
    public void moveZeroes(int[] nums) {
        int a=nums.length;
        int last=0;
        for(int i=0;i<a;i++){
            if(nums[i]!=0){
                nums[last]=nums[i];
                last++;
            }
        }
        for(int i=last;i<a;i++){
            nums[i]=0;
        }
    }
}
