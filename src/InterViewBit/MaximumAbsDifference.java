package InterViewBit;

import java.util.ArrayList;

public class MaximumAbsDifference {
    public int solution(ArrayList<Integer> arr){
        int Max1 = Integer.MIN_VALUE;
        int Max2 = Integer.MIN_VALUE;
        int Min1 = Integer.MAX_VALUE;
        int Min2 = Integer.MAX_VALUE;

        for (int i=0;i<arr.size();i++) {
            Max1 = Math.max(Max1, arr.get(i) + i);
            Min1 = Math.min(Min1, arr.get(i) + i);
            Max2 = Math.max(Max2, arr.get(i) - i);
            Min2 = Math.min(Min2, arr.get(i) - i);
        }

        return Math.max(Max1 - Min1, Max2 - Min2);
    }
}
