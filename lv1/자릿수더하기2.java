
import java.util.*;

public class 자릿수더하기2 {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            // 입력한 값을 10으로 나눈 나머지를 answer에 더해준다.
            answer += n % 10;
            // 입력한 값을 10으로 나눈 몫을 n에 저장한다.
            n /= 10;
        }

        return answer;
    }
}
