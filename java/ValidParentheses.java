/**
 * Author: Chih-Jye Wang
 * Date  : Dec 19, 2013
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
import java.util.Stack;

public class ValidParentheses
{
    public boolean isValid(String s)
    {
        if(s == null || s.length() == 0)
            return true;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if(c == ')')
            {
                if(stack.empty() || stack.pop() != '(')
                    return false;
            }
            else if(c == '}')
            {
                if(stack.empty() || stack.pop() != '{')
                    return false;
            }
            else if(c == ']')
            {
                if(stack.empty() || stack.pop() != '[')
                    return false;
            }
            else
                return false;
        }
        return stack.empty();
    }
    
    public static void main(String[] args)
    {
        ValidParentheses sol = new ValidParentheses();
        sol.isValid("]");
    }
}