public class 다음큰숫자 {

    public static void main(String[] args) {
        System.out.println(solution(78));
    }

    public static int solution(int n) {
        int answer = 0;
        // n의 1 개수를 저장
        int count = Integer.bitCount(n);

        while(true){
            // 조건을 만족할 때 까지 n을 1씩 증가
            n++;
            // 증가된 n의 1 개수를 저장
            int nextCount = Integer.bitCount(n);
            // n의 1의 갯수와 일치하는 그 다음수를 찾으면, answer에 n을 담고 반복문 종료.
            if(count == nextCount){
                answer = n;
                break;
            }
        }
        return answer;
    }
}
