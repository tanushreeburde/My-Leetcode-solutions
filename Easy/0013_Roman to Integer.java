/*Problem Statement: Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II
Roman numerals are usually written largest to smallest from left to right.However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX.
*/
//Link: https://leetcode.com/problems/roman-to-integer/description/
//
//Approach:
// 1. Used switch case to allocate values to each roman number.
// 2. Convert String to char array so that each roman numerical can be fetched.
// 3. Compare the values and added or subtracted numbers accordingly.
//
// Complexity:
// Time: O(n)
// Memory: O(n)
class Solution {
    public int romanToInt(String s) {
        char str[]=s.toCharArray();
        int intstr[]=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            switch(str[i])
            {
                case 'I':
                intstr[i]=1;
                break;
                case 'V':
                intstr[i]=5;
                break;
                case 'X':
                intstr[i]=10;
                break;
                case 'L':
                intstr[i]=50;
                break;
                case 'C':
                intstr[i]=100;
                break;
                case 'D':
                intstr[i]=500;
                break;
                case 'M':
                intstr[i]=1000;
                break;
                default:
                break;

            }
        }
        int result=0;
        for(int i=0; i<str.length-1;i++)
        {
            if((intstr[i])<intstr[i+1])
            {
                result-=intstr[i];

            }
            else{
                result+=intstr[i];
            }
            

        }
        return result+=intstr[str.length-1];
        
    }
}
