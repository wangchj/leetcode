import java.util.Stack;

class MinStack
{
    //Interetingly, LinkedList class gives exceed memory from LeetCode
    Stack<Integer> stack;
    Stack<Integer> mins;
    
    public MinStack()
    {
        stack = new Stack<Integer>();
        mins  = new Stack<Integer>();
    }
    
    public void push(int x)
    {
        stack.push(x);
        
        if(stack.isEmpty() || mins.isEmpty() || x <= mins.peek())
            mins.push(x);
    }

    public void pop()
    {
        int top = stack.pop();
        int minTop = mins.peek();
        if(top == minTop)
            mins.pop();
    }

    public int top() 
    {
        return stack.peek();
    }

    public int getMin()
    {
        return mins.peek();    
    }
}
