import java.util.Arrays;

public class 카펫 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int carpet = brown + yellow;

        // yellow가 존재하기 위해서는 가로와 세로의 길이가 3이상이여야 한다.
        for (int i = 3; i <= carpet; i++) {
            int col = i; // 세로
            int row = carpet / col; // 가로

            // 가로의 갯수가 3 이하라면 다음 인덱스
            if (row < 3) {
                continue;
            }

            // "가로는 세로의 길이보다 크거나 같다" 조건
            if (row >= col) {
                // 아래 조건이 성립된다면 반복문 종료
                if ((row - 2) * (col - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        return answer;
    }
}
