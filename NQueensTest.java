import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class NQueensTest
{
    /** Fixture initialization (common initialization
    *  for all tests). **/
    @Before public void setUp()
    {
    }


    /** A test that always fails. **/
    @Test public void test()
    {
        NQueens sol = new NQueens();
        List<String[]> res = sol.solveNQueens(4);
    }
}
