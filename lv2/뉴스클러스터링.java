import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.List;

public class 뉴스클러스터링 {
    public static void main(String[] args) {
        System.out.println(solution("FRANCE", "french"));
        System.out.println(solution("aa1+aa2", "AAAA12"));
        System.out.println(solution("aaaa", "bbbb"));
        System.out.println(solution("E=M*C^2", "e=m*c^2"));
    }

    public static int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> leftStr = splitStr(str1);
        List<String> rightStr = splitStr(str2);
        List<String> union = new ArrayList<>();
        List<String> intersection = new ArrayList<>();

        System.out.println(leftStr);
        System.out.println(rightStr);

        for (int i = 0; i < leftStr.size(); i++) {
            if (rightStr.contains(leftStr.get(i))) {
                union.add(leftStr.get(i));
            } else {
                intersection.add(leftStr.get(i));
            }
        }

        for (String s : rightStr) {
            intersection.add(s);
        }

        System.out.println(union);
        System.out.println(intersection);

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
