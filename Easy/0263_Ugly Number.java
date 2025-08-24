/*Problem Statement:An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
Given an integer n, return true if n is an ugly number. */
//Link: https://leetcode.com/problems/ugly-number/description/
/*Approach:
1. Apply a condition to return False on all non positive numbers.
2. Divide the number by 2 until it's divisible. Repeat same for 3 and 5.
3. If at the end the number becames 1 after all he divisions by 2,3 & 5, the number is an ugly number.Thus return True.
4. But if the number remain other than 1 then it conclude that the number is divisible by some other prime apart from 2,3 & 5.Thus return False.
*/
/*Complexity:
Time:O(log n)
Space:O(1)
*/

class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        } else {
            while (n % 2 == 0) {
                n = n / 2;
            }
            while (n % 3 == 0) {
                n = n / 3;
            }
            while (n % 5 == 0) {
                n = n / 5;
            }
            if (n == 1) {
                return true;
            } else {
                return false;
            }

        }
    }
}
