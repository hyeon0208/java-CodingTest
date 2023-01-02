import java.util.Stack;

public class 짝지어제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }
    public static int solution(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : ch) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (!stack.isEmpty()) {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
