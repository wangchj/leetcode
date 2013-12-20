import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class RotateImageTest
{
    RotateImage sol;
    
    /** Fixture initialization (common initialization
    *  for all tests). **/
    @Before public void setUp()
    {
        sol = new RotateImage();
    }


    /** A test that always fails. **/
    @Test public void test1x1()
    {
        int[][]matrix = {{1}};
        sol.rotate(matrix);
    }
    
    @Test public void test2x2()
    {
        int[][]matrix = {{1,2},{3,4}};
        sol.rotate(matrix);
    }
    
    @Test public void test3x3()
    {
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        sol.rotate(matrix);
    }
}
