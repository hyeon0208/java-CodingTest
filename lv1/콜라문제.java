class 콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (!(n < a)) {
            int bottle = (n/a) * b;
            answer += bottle;
            n = bottle + (n%a);
        }
        return answer;
    }
}