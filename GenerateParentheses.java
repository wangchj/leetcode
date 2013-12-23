/**
 * Author: Chih-Jye Wang
 * Date  : Dec 22, 2013
 *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 *
 * Solution: Recursive.
 */
import java.util.ArrayList;

public class GenerateParentheses
{
    public ArrayList<String> generateParenthesis(int n)
    {
        ArrayList<String> result = new ArrayList<String>();
        if(n == 0){result.add(""); return result;}
        if(n == 1){result.add("()"); return result;}
        
        //i represent n inside first parenthesis
        for(int i = 0; i < n; i++)
        {
            ArrayList<String> nested = generateParenthesis(i);
            ArrayList<String> remain = generateParenthesis(n - 1 - i);
            for(String a : nested)
                for(String b : remain)
                    result.add('(' + a + ')' + b);
        }
        return result;
    }
}