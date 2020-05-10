package InterViewBit;

import java.util.ArrayList;
import java.util.List;

public class NumberRepeatAndMissing {
    public List<Integer> solution (ArrayList<Integer> arr){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n= arr.size();
        long sumOfNum= n*(n+1)/2;
        long sumOfNumSq= n*(n+1)*(2*n+1)/6;
        for(int i=0;i<n;i++){
            sumOfNum-=(long)arr.get(i);
            sumOfNumSq-=(long)(arr.get(i)*arr.get(i));
        }
        long sumNum = sumOfNumSq/sumOfNum;

        int missing = (int) (sumNum + sumOfNum)/2;
        int repeated = (int) (sumNum - missing);

        numbers.add(repeated);
        numbers.add(missing);

        return numbers;
    }
}
