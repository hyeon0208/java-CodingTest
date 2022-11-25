class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (true) {
            if (n < a) {
                break;
            }
            int bottle = (n / a) * b;
            answer += bottle;
            n = bottle + n%a;
        }
        return answer;
    }
}
