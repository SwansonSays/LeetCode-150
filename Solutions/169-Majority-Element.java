/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;

        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                majority = nums[i];
                count = 1;
            } else if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}