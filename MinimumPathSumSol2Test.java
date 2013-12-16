import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MinimumPathSumSol2Test {


    /** Fixture initialization (common initialization
     *  for all tests). **/
    @Before public void setUp() {
    }


    /** A test that always fails. **/
    @Test public void test() {
        MinimumPathSumSol2 sol = new MinimumPathSumSol2();
        int[][] grid = {{1,2},{1,1}};
        Assert.assertEquals(3, sol.minPathSum(grid));
    }
}
