
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
