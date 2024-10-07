package com.leetcode.string.easy;

public class GoalParserInterpretation {

    /**
     * 1678. Goal Parser Interpretation
     * Easy
     * Topics
     * Companies
     * Hint
     * You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
     * <p>
     * Given the string command, return the Goal Parser's interpretation of command.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: command = "G()(al)"
     * Output: "Goal"
     * Explanation: The Goal Parser interprets the command as follows:
     * G -> G
     * () -> o
     * (al) -> al
     * The final concatenated result is "Goal".
     * Example 2:
     * <p>
     * Input: command = "G()()()()(al)"
     * Output: "Gooooal"
     * Example 3:
     * <p>
     * Input: command = "(al)G(al)()()G"
     * Output: "alGalooG"
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= command.length <= 100
     * command consists of "G", "()", and/or "(al)" in some order.
     */
    public static String interpret(String command) {
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if(c != '(' && c != ')') {
                word.append(c);
            } else if(c == ')' && command.charAt(i - 1) == '(') {
                word.append('o');
            }
        }
        return word.toString();

//        String replace = command.replace("()", "o");
//        replace = replace.replace("(al)", "al");
//        return replace;
    }
}
/**
 * G -> G
 * () -> o
 * (al) -> al
 */