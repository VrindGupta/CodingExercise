/*
/*

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.

*/

package InterViewBit;


import java.util.List;

public class MaxSumContiguousSubArray {
    public int maxSubArray(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
        int end = 0;

        for (Integer integer : A) {
            end = end + integer;

            if (max < end) max = end;

            if (end < 0) {
                end = 0;
            }
        }

        return max;
    }
}
