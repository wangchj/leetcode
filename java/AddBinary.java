/**
 * Author: Chih-Jye Wang
 * Date  : Feb 13, 2014
 *
 * Given two binary strings, return their sum (also a binary string).
 *
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class AddBinary
{
    public static String addBinary(String a, String b)
    {
        StringBuilder r = new StringBuilder(Math.max(a.length(), b.length()) + 1);
        boolean carry = false;
        for(int i = 0; i < a.length() || i < b.length(); i++)
        {
            boolean ba = (i < a.length() ? a.charAt(a.length() - 1 - i) == '1' : false);
            boolean bb = (i < b.length() ? b.charAt(b.length() - 1 - i) == '1' : false);
            if(!ba && !bb && !carry)     //case 1
                r.append('0');
            else if(!ba && !bb && carry) //case 2
            {
                r.append('1');
                carry = false;
            }
            else if(!ba && bb && !carry) //case 3
                r.append('1');
            else if(!ba && bb && carry)  //case 4
                r.append('0');
            else if(ba && !bb && !carry) //case 5
                r.append('1');
            else if(ba && !bb && carry)  //case 6
                r.append('0');
            else if(ba && bb && !carry)  //case 7
            {
                r.append('0');
                carry = true;
            }
            else if(ba && bb && carry)   //case 8
                r.append('1');
        }
        if(carry)
            r.append('1');
        return r.reverse().toString();
    }
    
    public static void main(String[] args)
    {
        String r = addBinary("0", "0");
        r = addBinary("0", "1");
        r = addBinary("1", "0");
        r = addBinary("1", "1");
        r = addBinary("1010", "1");
        r = addBinary("1010", "11");
    }
}