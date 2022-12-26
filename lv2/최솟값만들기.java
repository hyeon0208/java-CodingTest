import java.util.Arrays;

class 최솟값만들기 {
    public int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        // 한 쪽의 최댓값과 다른 쪽의 최솟값을 곱하는 경우 누적값을 최소로 구할 수 있다
        for (int i = 0; i < A.length; i++) {
            answer += A[i]*B[B.length-i-1];
        }

        return answer;
    }
}