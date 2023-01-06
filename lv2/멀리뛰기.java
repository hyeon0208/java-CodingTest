public class 멀리뛰기 {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }

    public static long solution(int n) {
        long[] answer = new long[2001];
        answer[1] = 1;
        answer[2] = 2;

        for (int i = 3; i < 2001; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }

        return answer[n];
    }
}
