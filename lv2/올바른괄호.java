import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // '(' 괄호로 시작한다면 스택에 '('를 채워넣는다.
            if(ch == '('){
                stack.push(ch);
            }

            // ')' 괄호로 시작하는데, 스택이 비었으면 '('로 시작하지 않으므로 false를 반환한다.
            if(ch == ')'){
                if(stack.isEmpty()) {
                    return false;
                }
                // 아니라면 '('와 ')'가 바르게 짝지어졌으므로 push 했던 '('괄호를 뺀다.
                stack.pop();
            }
        }

        // stack이 비었다면 괄호 쌍이 올바르게 짝지어졌으므로 true, 아니라면 false를 반환한다.
        answer = (stack.isEmpty()) ? true : false;

        return answer;
    }
}