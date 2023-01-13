import java.util.Stack;

public class 괄호회전 {
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
        System.out.println(solution("[)(]"));
    }

    public static int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder(s);
            // 만 앞의 문자열을 맨 뒤로 옮겨 회전
            String rotation = str.substring(0, i);
            str.delete(0,i);
            str.append(rotation);

            if(checkStr(str)){
                answer += 1;
            }
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("| 회전 후 괄호 : " + str + " \n| 올바른 괄호인가 : " + checkStr(str));
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        }
        return answer;
    }

    public static boolean checkStr(StringBuilder str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else if (c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
