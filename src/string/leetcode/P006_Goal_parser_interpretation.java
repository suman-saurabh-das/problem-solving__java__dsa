package string.leetcode;

/*
    1678. Goal parser interpretation
    https://leetcode.com/problems/goal-parser-interpretation/description/

    Input: command = "G()(al)"
    Output: "Goal"
    Input: command = "G()()()()(al)"
    Output: "Gooooal"
    Input: command = "(al)G(al)()()G"
    Output: "alGalooG"
*/

public class P006_Goal_parser_interpretation {
    public static void main(String[] args) {
        String command1 = "G()(al)", command2 = "G()()()()(al)", command3 = "(al)G(al)()()G";
        System.out.println("Interpretation : " + interpret(command1));
        System.out.println("Interpretation : " + interpret(command2));
        System.out.println("Interpretation : " + interpret(command3));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < command.length()) {
            if (command.charAt(index) == 'G') {
                result.append("G");
                index++;
            }
            else if (command.charAt(index) == '(' && command.charAt(index + 1) == ')') {
                result.append("o");
                index = index + 2;
            } else {
                result.append("al");
                index = index + 4;
            }
        }
        return result.toString();
    }
}
