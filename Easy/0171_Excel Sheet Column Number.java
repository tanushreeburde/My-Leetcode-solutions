/*Problem Statement: Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
For example:
A -> 1
B -> 2
AA -> 27
AB -> 28 
*/
//Link: https://leetcode.com/problems/excel-sheet-column-number/description/
/*Approach:
1. Let val be the value of the character(i.e A=1, B=2..). To get that I used the formula: val=ch%65+1 (Bcz Ascii value of 'A' is 65)
2. After getting the value we just have to add that to the result like so 26^(digit-1)*val
3. for better understanding lets take an example(its very similar to how we expand an integer in terms of 10 power) :
    Here we are expanding in terms of 26 power
    eg: AZBY
            char:    A        Z        B         Y
           digit:    3        2        1         0
           value:    1        26       2        25
       Expanding: (26^3*1)+(26^2*26)+(26^1*2)+(26^0*25)
                 =35229

*/
/*Complexity:
Time:O(n)
Space:O(1)
*/
class Solution {
    static int power(int num,int pow)
    {
        int res=1;
        for(int i=0;i<pow;i++)
        {
            res*=26;
        }
        return res;
    }
    public int titleToNumber(String columnTitle) {
        int colno=0,j=0;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            char ch=columnTitle.charAt(j);
            j++;
            int val=ch%65+1;
            colno+=power(26,i)*val;
        }
        return colno;
        
    }
}
