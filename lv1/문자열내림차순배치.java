import java.util.*;

class 문자열내림차순배치 {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        StringBuilder sb = new StringBuilder(new String(charArr));
        return sb.reverse().toString();

    }
}