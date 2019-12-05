import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MinStackTest
{
   /** A test that always fails. **/
    @Test public void defaultTest()
    {
       MinStack s = new MinStack();
       s.push(2147483646);
       s.push(2147483646);
       s.push(2147483647);
       Assert.assertEquals(2147483647,s.top());
       s.pop();
       Assert.assertEquals(2147483646,s.getMin());
       s.pop();
       Assert.assertEquals(2147483646,s.getMin());
       s.pop();
       s.push(2147483647);
       Assert.assertEquals(2147483647,s.top());
       Assert.assertEquals(2147483647,s.getMin());
       s.push(-2147483648);
       Assert.assertEquals(-2147483648, s.top());
       Assert.assertEquals(-2147483648, s.getMin());
       s.pop();
       Assert.assertEquals(2147483647,s.getMin());
    }
}
