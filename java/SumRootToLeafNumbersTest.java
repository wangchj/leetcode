import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SumRootToLeafNumbersTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      TreeNode n = TreeNode.deserialize("{4,9,0,#,1}");
      SumRootToLeafNumbers sol = new SumRootToLeafNumbers();
      System.out.println(sol.sumNumbers(n));
   }
}
