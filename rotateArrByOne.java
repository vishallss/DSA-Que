/* 832. Left Rotate Array by One
Given an integer array nums, rotate the array to the left by one.

Note: There is no need to return anything, just modify the given array.

Example 1:
Input: nums = [1, 2, 3, 4, 5]

Output: [2, 3, 4, 5, 1]

Explanation:

Initially, nums = [1, 2, 3, 4, 5]

Rotating once to left -> nums = [2, 3, 4, 5, 1]  */

 //* REVIEW: 👁️  https://takeuforward.org/practice/dsa/left-rotate-array-by-one */


class Solution {
    public void rotateArrByOne(int[] nums) {
        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};

        Solution obj = new Solution();
        obj.rotateArrByOne(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}