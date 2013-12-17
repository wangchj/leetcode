/**
 * Author: Chih-Jye Wang
 * Date  : Dec 17, 2013
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger
{
    public int romanToInt(String s)
    {
        int i   = 0;
        int sum = 0;
        while(i < s.length())
        {
            //Last character of the string
            if(i == s.length() - 1)
                return sum + digitValue(s.charAt(i));
            
            //Get the value of current and next positions
            int current = digitValue(s.charAt(i));
            int next    = digitValue(s.charAt(i + 1));
            //If current is less than next, subtractive notation;
            //Else normal additive notation.
            if(current < next)
            {    
                sum += next - current;
                i   += 2;
            }    
            else
            {
                sum += current;
                i++;
            }        
        }
        return sum; 
    }
    
    int digitValue(char roman)
    {
        switch(roman)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}