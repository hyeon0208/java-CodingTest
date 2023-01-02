import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{70, 80, 50 ,50}, 100));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        Arrays.sort(people);

        for (int max = people.length - 1; max >= min; max--) {
            int weight = people[min] + people[max];
            // 최소 + 최대 몸무게 2명의 합이 무제게한보다 같거나 작은 경우 두명을 한 보트에 태워 보낸다.
            // 그 다음 몸무게가 작은 사람을 기준으로 해야기 때문에 min값을 ++한다.
            if (weight <= limit) {
                min++;
                answer++;
            }

            // 가장 큰 몸무게의 사람은 보트에 혼자 태워 보낸다.
            if (weight > limit) {
                answer++;
            }
        }
        return answer;
    }
}
