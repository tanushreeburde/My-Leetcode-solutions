/*Problem Statement: Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
*/
//Link:https://leetcode.com/problems/single-number/description/
/*Approach:
Hint given: Understand the working of XOR(^) operator.
Since every number except one appears twice, those pairs cancel each other out (a ^ a = 0).
The only number that remains is the one that appears once.

Example:
nums = [2, 3, 5, 4, 5, 3, 2]

Step-by-step:
Start: res = 0
res ^ 2 = 0 ^ 2 = 2
res ^ 3 = 2 ^ 3 = 1 (binary: 10 ^ 11 = 01)
res ^ 5 = 1 ^ 5 = 4 (binary: 001 ^ 101 = 100)
res ^ 4 = 4 ^ 4 = 0
res ^ 5 = 0 ^ 5 = 5
res ^ 3 = 5 ^ 3 = 6
res ^ 2 = 6 ^ 2 = 4
Final result = 4
*/
/*Complexity: 
Time: O(n)
Space: O(1) */

class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            res^=nums[i];
        }
        return res;
    }
}
