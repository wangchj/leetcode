import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Permutations
{
    public List<List<Integer>> permute(int[] num)
    {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(num.length == 1)
        {
            List<Integer> l = new ArrayList<Integer>();
            l.add(num[0]);
            res.add(l);
            return res;
        }
            
        //Take the first element of the array
        int head = num[0];
        //Make the remainder array
        int[] rem = Arrays.copyOfRange(num, 1, num.length);
        //Make recursive call
        List<List<Integer>> perms = permute(rem);
        
        for(List<Integer> perm : perms)
        {
            for(int i = 0; i <= perm.size(); i++)
            {
                List<Integer> l = new ArrayList<Integer>(perm);
                l.add(i, head);
                res.add(l);
            }
        }
        
        return res;
    }
}