/*Problem Statement: Given an integer x, return true if x is a palindrome, and false otherwise.*/
//Link: https://leetcode.com/problems/palindrome-number/description/
//
//Approach:
// 1. Used modulus formula to get each digit from the x and stored in rev using a formula such that we get reversed x in rev.
// 2. Then compared rev with x value that was stored in ori variable and also put condition for non-postive numbers.
//
// Complexity:
// Time: O(log(n))
// Memory: O(1)

class Solution {
    public boolean isPalindrome(int x) {
        int ori = x;
        int rev = 0;
        if (x < 0) {
            return false;
        } 
        else {
            while (x != 0) {
                rev = rev * 10 + x % 10;
                x=x/10;
            }
            return ori == rev;
        }
    }
}
