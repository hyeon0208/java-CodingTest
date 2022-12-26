import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class 모의고사 {
    public int[] solution(int[] answers) {
        List<Integer> result = new ArrayList<>();
        int[] firstStudent = {1, 2, 3, 4, 5};
        int[] secondStudent = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdStudent = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<Integer> maxResult = new ArrayList<>();

        int firstStudentCount = 0, secondStudentCount = 0, thirdStudentCount = 0;

        for (int i = 0; i < answers.length; i++) {
            if (firstStudent[i%firstStudent.length] == answers[i]) {
                firstStudentCount++;
                maxResult.add(firstStudentCount);
            }
            if (secondStudent[i%secondStudent.length] == answers[i]) {
                secondStudentCount++;
                maxResult.add(secondStudentCount);
            }
            if (thirdStudent[i%thirdStudent.length] == answers[i]) {
                thirdStudentCount++;
                maxResult.add(thirdStudentCount);
            }
        }

        int maxScore = Collections.max(maxResult);

        if (maxScore == firstStudentCount) {
            result.add(1);
        }
        if (maxScore == secondStudentCount) {
            result.add(2);
        }
        if (maxScore == thirdStudentCount) {
            result.add(3);
        }

        return result.stream().mapToInt(i -> i.intValue()).toArray();
    }
}