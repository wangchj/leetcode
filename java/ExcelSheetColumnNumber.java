/**
 * Author: Chih-Jye Wang
 * Date  : Feb 8, 2015
 *
 * Related to question Excel Sheet Column Title
 *
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28 
 */
public class ExcelSheetColumnNumber
{
    public int titleToNumber(String s)
    {
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += (s.charAt(s.length() - 1 - i) - ('A' - 1)) * Math.pow(26, i);
        }
        return sum;
    }
}