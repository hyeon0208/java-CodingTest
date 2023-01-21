import java.util.HashSet;
import java.util.Set;

public class 전화번호목록 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123", "456", "789"}));
        System.out.println(solution(new String[]{"12", "123", "1235", "567", "88"}));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> book = new HashSet<>();

        for (String number : phone_book) {
            book.add(number);
        }

        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                if (book.contains(number.substring(0, i))) {
                    answer = false;
                }
            }
        }

        return answer;
    }
}
