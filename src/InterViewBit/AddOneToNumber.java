/*

Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

    NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
    For example, for this problem, following are some good questions to ask :

        Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?

        A : For the purpose of this question, YES
        Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
        A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

    NOTE: You only need to implement the given function. Do not read input,
    instead use the arguments to the function. Do not print the output, instead return values as specified.

 */
package InterViewBit;

import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 1;

        int i = 0;
        while (i < A.size() - 1 && A.get(i) == 0) {
            A.remove(i);
        }

        i = A.size() - 1;
        while (i >= 0) {
            int temp = carry + A.get(i);
            carry = temp / 10;
            temp = temp % 10;

            A.set(i, temp);

            if (carry == 0) break;
            i--;
        }

        if (carry > 0) {
            A.add(0, carry);
        }


        return A;
    }

}
