import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})));
    }

    public static String[] solution(String[] record) {
        List<String> results = new ArrayList<>();
        List<List<String>> info = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            info.add(new ArrayList<>(List.of(record[i].split(" "))));
        }

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            String status = info.get(i).get(0);
            String id = info.get(i).get(1);
            String name;
            if (status.equals("Enter")) {
                results.add(id + "님이 들어왔습니다.");
                name = info.get(i).get(2);
                map.put(id, name);
            }
            if (status.equals("Leave")){
                results.add(id + "님이 나갔습니다.");
            }
            if (status.equals("Change")) {
                name = info.get(i).get(2);
                map.put(id, name);
            }
        }

        String[] answer = new String[results.size()];
        for (int i = 0; i < results.size(); i++) {
            int division = results.get(i).indexOf("님");
            String id = results.get(i).substring(0, division);
            answer[i] = map.get(id) + results.get(i).substring(division);
        }

        return answer;
    }
}
