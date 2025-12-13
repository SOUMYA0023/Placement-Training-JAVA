import java.util.Stack;

public class BalancedBrackets {

    public static Boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If stack empty → unbalanced
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // After processing, stack must be empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})"));
        System.out.println(isBalanced("([)]"));
        System.out.println(isBalanced("((()))"));
    }
}