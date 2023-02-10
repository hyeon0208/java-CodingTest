import java.awt.BorderLayout;
import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 뉴스클러스터링 {
    public static void main(String[] args) {
        System.out.println(solution("FRANCE", "french"));
        System.out.println(solution("handshake", "shake hands"));
        System.out.println(solution("aa1+aa2", "AAAA12"));
        System.out.println(solution("E=M*C^2", "e=m*c^2"));
        System.out.println(solution("abab", "baba"));
    }

    public static int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> leftStr = splitStr(str1);
        List<String> rightStr = splitStr(str2);
        List<String> union = new ArrayList<>(); // 합집합
        List<String> intersection = new ArrayList<>(); // 교집합

        System.out.println("left : " + leftStr);
        System.out.println("right : " + rightStr);

        Boolean[] visited = new Boolean[leftStr.size()];

        for (int i = 0; i < leftStr.size(); i++) {
            visited[i] = false;
            if (rightStr.contains(leftStr.get(i)) && !visited[leftStr.indexOf(leftStr.get(i))]) {
                visited[leftStr.indexOf(leftStr.get(i))] = true;
                union.add(leftStr.get(i));
            }
            if (!rightStr.contains(leftStr.get(i))) {
                intersection.add(leftStr.get(i));
            }
        }
        System.out.println(Arrays.toString(visited));

        for (String s : rightStr) {
            intersection.add(s);
        }


        System.out.println("교집합 : " + union);
        System.out.println("합집합 : " + intersection);

        double jakard = 0;
        double unionCount = union.size();
        double intersectionCount = intersection.size();

        if (unionCount == 0) {
            return 1;
        } else {
            jakard = unionCount / intersectionCount;
        }

        return (int) (jakard * 65536);
    }

    private static List<String> splitStr(String str) {
        List<String> strLists = new ArrayList<>(str.length());
        for (int i = 0; i < str.length() - 1; i++) {
            char first = str.charAt(i);
            char second = str.charAt(i + 1);
            if (first >= 'a' && first <= 'z' && second >= 'a' && second <= 'z') {
                strLists.add(first + "" + second);
            }
        }
        return strLists;
    }
}
