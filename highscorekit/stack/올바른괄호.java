package highscorekit.stack;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
    }

    static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            }

            if (c == ')') {
                // ")"로 끝나면 false 리턴
                if (stack.size() == 0) {
                    return false;
                }
                stack.pop();
            }
        }
        answer = stack.isEmpty() ? true : false;

        return answer;
    }
}
