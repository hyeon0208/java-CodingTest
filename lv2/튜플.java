import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

class 튜플 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));
        System.out.println(Arrays.toString(solution("{{20,111},{111}}")));
    }

    public static int[] solution(String s) {
        s = s.replaceAll("\\{", "");
        String[] sArr = s.substring(0, s.length() - 2).split("\\}\\,");
        Arrays.sort(sArr, Comparator.comparingInt(String::length));

        HashSet<Integer> duplicate = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < sArr.length; i++) {
            int[] tuple = Stream.of(sArr[i].split(",")).mapToInt(Integer::parseInt).toArray();
            for (int num : tuple) {
                if (!duplicate.contains(num)) {
                    result.add(num);
                }
                duplicate.add(num);

                System.out.println("---------------------");
                System.out.println("대상 값 : " + num);
                System.out.println("result : " + result);
                System.out.println("duplicate : " + duplicate);
                System.out.println("---------------------");
            }
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
