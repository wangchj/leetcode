/**
 * Author: Chih-Jye Wang
 * Date  : Dec 17, 2013
 *
 * Given an integer, convert it to a roman numeral.
 *
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class IntegerToRoman
{
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        //1000s
        int m = num / 1000;
        for(int i = 0; i < m; i++)
            result.append('M');
        num = num % 1000;
        //900s
        m = num / 900;
        for(int i = 0; i < m; i++)
            result.append("CM");
        num = num % 900;
        //500s
        m = num / 500;
        for(int i = 0; i < m; i++)
            result.append('D');
        num = num % 500;
        //400s
        m = num / 400;
        for(int i = 0; i < m; i++)
            result.append("CD");
        num = num % 400;
        //100s
        m = num / 100;
        for(int i = 0; i < m; i++)
            result.append('C');
        num = num % 100;
        //90s
        m = num / 90;
        for(int i = 0; i < m; i++)
            result.append("XC");
        num = num % 90;
        //50s
        m = num / 50;
        for(int i = 0; i < m; i++)
            result.append('L');
        num = num % 50;
        //40s
        m = num / 40;
        for(int i = 0; i < m; i++)
            result.append("XL");
        num = num % 40;
        //10s
        m = num / 10;
        for(int i = 0; i < m; i++)
            result.append('X');
        num = num % 10;
        //9s
        m = num / 9;
        for(int i = 0; i < m; i++)
            result.append("IX");
        num = num % 9;
        //5s
        m = num / 5;
        for(int i = 0; i < m; i++)
            result.append('V');
        num = num % 5;
        //5s
        m = num / 4;
        for(int i = 0; i < m; i++)
            result.append("IV");
        num = num % 4;
        //1s
        m = num / 1;
        for(int i = 0; i < m; i++)
            result.append('I');
        num = num % 1;
        
        return result.toString();
    }    
}