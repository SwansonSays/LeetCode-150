class Solution80 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n < 3) {
            return n;
        }

        int fast = 2;
        int slow = 2;

        while(fast < n) {
            if(nums[fast] == nums[slow - 2]) {
                fast++;
            } else {
                nums[slow++] = nums[fast++];
            }
        }
        return slow;
    }
}

