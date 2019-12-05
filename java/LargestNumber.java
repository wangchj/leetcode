import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] num) {

        //Anonymous Comparator
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return (("" + a + b).compareTo("" + b + a));
            }
        };

        //Convert int array to Integer array
        Integer[] a = new Integer[num.length];
        for(int i = 0; i < num.length; i++)
            a[i] = Integer.valueOf(num[i]);

        //Sort based on comparator
        Arrays.sort(a, Collections.reverseOrder(comp));

        if(a[0] == 0)
            return "0";
        
        //Combine sort result
        StringBuilder res = new StringBuilder();
        for(int i : a)
            res.append(i);

        return res.toString();
    }
}