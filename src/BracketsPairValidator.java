import java.util.ArrayDeque;
import java.util.Deque;

public class BracketsPairValidator {
    private final Deque<Character> stack = new ArrayDeque<>();
    private final String input;

    public BracketsPairValidator(String input) {
        this.input = input;
    }

    public boolean validate() {
        for (char c : input.toCharArray()) {
            if (isLeftParenthesis(c)) {
                stack.push(c);
            } else {
                if (checkStackTopIsPair(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean checkStackTopIsPair(char c) {
        if (stack.peek() == null) {
            return false;
        }

        char top = stack.peek();
        return (top == '(' && c == ')')
                || (top == '{' && c == '}')
                || (top == '[' && c == ']');
    }

    private boolean isLeftParenthesis(char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
