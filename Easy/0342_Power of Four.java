/*Problem Statement: Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4^x.*/
//Link:https://leetcode.com/problems/power-of-four/description/?envType=daily-question&envId=2025-08-15
/*Approach:
1. First Apply the condition that Number cannot be Zero or negetive 
2. then divide the number by 4 and store in number only till number becomes 1
3. if while dividing the remainder is non zero then return false (i.e number does not perfectly divisible by 4 and power of 4)*/
/*Complexity:
Time: O(n)
Space: O(1) */

class Solution {
    public boolean isPowerOfFour(int n) {
        boolean a = true;
        if(n<=0)
        {
            a=false;
        }
        else{
        while (n != 1) {
            int r = n % 4;
            if (r == 0) {
                n /= 4;
            } else {
                a = false;
                break;
            }
        }
        }
        return a;
    }
}
