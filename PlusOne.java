/**
 * Author: Chih-Jye Wang
 * Date  : Dec 19, 2013
 *
 * Given a number represented as an array of digits, plus one to the number.
 */
import java.util.Arrays;

public class PlusOne
{
    public int[] plusOne(int[] digits)
    {
        int[] result = new int[digits.length + 1];
        boolean carry = true;
        for(int i = digits.length - 1; i >= 0; i--)
        {
            if(carry && digits[i] == 9)
            {
                result[i + 1] = 0;
                carry = true;
            }
            else
            {
                if(carry) result[i + 1] = digits[i] + 1;
                else result[i + 1] = digits[i];
                carry = false;
            }
            
        }
        if(carry)
        {
            result[0] = 1;
            return result;
        }    
        else
            return Arrays.copyOfRange(result, 1, result.length);   
    }
    
    public static void main(String[] args)
    {
        PlusOne sol = new PlusOne();
        sol.plusOne(new int[] {9,8,7,6,5,4,3,2,1,0});
        
    }
}