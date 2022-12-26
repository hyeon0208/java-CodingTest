import java.util.Arrays;

class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        int count = score.length; //총 사과 개수
        int boxCount = count / m; //만들 수 있는 상자 개수
        int remainder = count % m; //상자를 만들고 남는 사과 개수

        Arrays.sort(score);

        for (int i = remainder; i < count; i = i + m) {
            int plus = score[i] * m;
            answer = answer + plus;
        }

        return answer;
    }
}