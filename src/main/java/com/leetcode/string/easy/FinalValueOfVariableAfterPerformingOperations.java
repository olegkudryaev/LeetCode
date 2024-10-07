package com.leetcode.string.easy;

public class FinalValueOfVariableAfterPerformingOperations {
    /**
     * 2011. Final Value of Variable After Performing Operations
     * Easy
     * Topics
     * Companies
     * Hint
     * There is a programming language with only four operations and one variable X:
     * <p>
     * ++X and X++ increments the value of the variable X by 1.
     * --X and X-- decrements the value of the variable X by 1.
     * Initially, the value of X is 0.
     * <p>
     * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: operations = ["--X","X++","X++"]
     * Output: 1
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * --X: X is decremented by 1, X =  0 - 1 = -1.
     * X++: X is incremented by 1, X = -1 + 1 =  0.
     * X++: X is incremented by 1, X =  0 + 1 =  1.
     * Example 2:
     * <p>
     * Input: operations = ["++X","++X","X++"]
     * Output: 3
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * ++X: X is incremented by 1, X = 0 + 1 = 1.
     * ++X: X is incremented by 1, X = 1 + 1 = 2.
     * X++: X is incremented by 1, X = 2 + 1 = 3.
     * Example 3:
     * <p>
     * Input: operations = ["X++","++X","--X","X--"]
     * Output: 0
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * X++: X is incremented by 1, X = 0 + 1 = 1.
     * ++X: X is incremented by 1, X = 1 + 1 = 2.
     * --X: X is decremented by 1, X = 2 - 1 = 1.
     * X--: X is decremented by 1, X = 1 - 1 = 0.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= operations.length <= 100
     * operations[i] will be either "++X", "X++", "--X", or "X--".
     */
    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            switch (operation) {
                case ("--X"), ("X--") -> result--;
                case ("++X"), ("X++") -> result++;
            }
        }
        return result;
    }
}
