//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
class Solution {
    public int removeDuplicates(int[] nums) {
        int a=nums.length;
        int c=1;
        for(int i=1;i<a;i++){
            if(nums[i]!=nums[i-1]){
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }
}
