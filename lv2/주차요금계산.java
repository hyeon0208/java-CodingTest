import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class 주차요금계산 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{180, 5000, 10, 600},
                new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                        "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"})));
    }

    public static int[] solution(int[] fees, String[] records) {
        // 주차한 차들의 번호와 시간을 갖는 리스트
        Map<String, Integer> parking = new HashMap<>();
        // 차들의 번호와 누적된 요금을 갖는 리스트 (트리맵으로 키 (차량번호) 기준 오름차순 정렬)
        Map<String, Integer> costs = new TreeMap<>();

        for (String r : records) {
            String[] record = r.split(" ");
            int time = getMin(record[0]); // 출차 시간
            String carNum = record[1]; // 차량번호
            String io = record[2]; // 출입

            if (io.equals("IN")) {
                parking.put(carNum, time);
            }
            if (io.equals("OUT")) {
                // 한번 들어왔던 차가 아니라면
                if (!costs.containsKey(carNum)) {
                    costs.put(carNum, time - parking.get(carNum));
                } else { // 한번 입출차한 기록이있다면 기존 시간에 새 시간 누적
                    costs.put(carNum, costs.get(carNum) + time - parking.get(carNum));
                }
                parking.remove(carNum);
            }
        }

        // 아직 출차하지 않은 차 계산
        if (!parking.isEmpty()) {
            for (String carNum : parking.keySet()) {
                costs.put(carNum, costs.get(carNum) + ((23 * 60 + 59) - parking.get(carNum)));
            }
        }

        List<Integer> answer = new ArrayList<>(costs.size());
        for (Integer c : costs.values()) {
            int basicTime = fees[0];
            int basicCharge = fees[1];
            int unitTime = fees[2];
            int unitCharge = fees[3];

            // 요금 = 기본요금 + ((min-기본시간) / 단위시간) * 단위요금
            if (c <= basicTime) {
                answer.add(basicCharge) ;
            } else {
                answer.add((int) (basicCharge + Math.ceil((double) (c - basicTime) / unitTime) * unitCharge));
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // 시간을 분으로 환산하는 메서드
    private static int getMin(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
}
