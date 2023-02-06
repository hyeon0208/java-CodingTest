import java.util.ArrayList;
import java.util.List;

public class 할인행사 {
    final static int DISCOUNT_MATCH_DAY = 10;

    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
                "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));
    }


    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        List<String> wantLists = new ArrayList<>();

        // 원하는 제품의 수량만큼 제품을 List에 추가
        for (int i = 0; i < want.length; i++) {
            while (number[i]-- > 0) {
                wantLists.add(want[i]);
            }
        }

        for (int i = 0; i < discount.length - DISCOUNT_MATCH_DAY + 1; i++) {
            List<String> buyLists = new ArrayList<>(wantLists);
            // 원하는 제품과 수량이 할인하는 날짜와 10일 연속으로 일치하는지 확인
            for (int j = i; j < DISCOUNT_MATCH_DAY + i; j++) {
                if (!buyLists.contains(discount[j])) {
                    continue;
                }
                if (buyLists.contains(discount[j])) {
                    buyLists.remove(discount[j]);
                }
            }
            // List의 크기가 0이라면 10일 연속으로 일치 한 것
            answer += buyLists.size() == 0 ? 1 : 0;
        }

        return answer;
    }
}
