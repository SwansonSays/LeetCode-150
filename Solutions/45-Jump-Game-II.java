/*
You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
    0 <= j <= nums[i] and
    i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 */

class Solution45 {
    public int jump(int[] nums) {
        int n = nums.length;
        int min = 0;
        int max = 0;
        int count = 0;

        for(int i = 0; i < n - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if(max >= n - 1) {
                count++;
                return count;
            }
            if(i == min) {
                count++;
                min = max;
            }
        }
        return count;
    }
}