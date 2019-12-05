import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MinimumPathSumSol3Test {

    @Test public void test1x1()
    {
        int[][] grid = {{1}};
        MinimumPathSumSol3 sol = new MinimumPathSumSol3();
        Assert.assertEquals(1, sol.minPathSum(grid));
    }
    
    @Test public void test2x2()
    {
        int[][] grid = {{1,1},{2,1}};
        MinimumPathSumSol3 sol = new MinimumPathSumSol3();
        Assert.assertEquals(3, sol.minPathSum(grid));
    }
}
