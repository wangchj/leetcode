import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class PermutationsTest
{
   /** A test that always fails. **/
    @Test public void defaultTest()
    {
        Permutations perm = new Permutations();
        List<List<Integer>> res = perm.permute(new int[] {0, 1});
    }
}
