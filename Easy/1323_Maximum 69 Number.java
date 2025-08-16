/*Problem Statement:You are given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).*/
//Link:https://leetcode.com/problems/maximum-69-number/description/?envType=daily-question&envId=2025-08-16
/* Approach:
1. I used List interface to the the number as an array.
2. then started travering from start finding 6 on the way and if the number is 6 then convert it to 9 and return the list.
3. now convert list back to int ,thats the output.
*/
/*Complexity:
Time:O(n)
Space:O(n) */

import java.util.ArrayList;
class Solution {
    public int maximum69Number (int num) {
      int max=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(num>0){
            int rem=num%10;
            list.add(0,rem);
            num=num/10;
        }
        int i=0;
        while(i<list.size())
        {
            if(list.get(i)==6)
            {
                list.set(i,9);
                break;
            }
            i++;
        }
        for(int j : list)
        {
            max=max*10+j;
        }
        return max;  
    }
}
