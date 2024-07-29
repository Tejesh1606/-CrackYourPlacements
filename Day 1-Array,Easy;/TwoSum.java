//https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int []b=new int[2];
        int k=1;
        for(int i = 0; i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target && k==1){
                    b[0]=i;
                    b[1]=j;
                    k=0;
                    break;
                }
            }
        }
        return b;
    }
}
