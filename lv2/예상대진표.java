public class 예상대진표 {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, 7));
    }

    public static int solution(int n, int a, int b) {
        int answer = 0;

        // 순서가 같아진다면 a, b 참가자가 서로 만난 것이므로 종료한다.
        while (a != b) {
            // 그 다음 대진표의 순서는 다음과 같은 공식으로 바뀐다.
            a = (a / 2) + (a % 2);
            b = (b / 2) + (b % 2);

            answer++;
        }
        return answer;
    }
}
