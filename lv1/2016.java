import java.time.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate day = LocalDate.of(2016, a, b);
        return day.getDayOfWeek().toString().substring(0,3);
    }
}