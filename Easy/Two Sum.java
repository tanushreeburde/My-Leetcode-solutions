/*Problem Statement: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/
//Link: https://leetcode.com/problems/two-sum/description/
//
//Approach:
// 1. I used nested loop that adds up the array elements and compare it with target. 
//
// Complexity:
// Time: O(n^2) -it can be reduced using hashmaps or other ways but I haven't studied that for now. Till that this was the approach I would think of
class Solution {
    public int[] twoSum(int[] nums, int target) 
  {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = i + 1; j < nums.length; j++) 
            {
                if (nums[i] + nums[j] == target) 
                {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
