/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.
 */
class Solution55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int end = n - 1;
        for(int i = n-2; i >= 0; i--) {
            if(i + nums[i] >= end) {
                end = i;
            }
        }

        return (end == 0);
    }
}