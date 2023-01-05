package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        // 지정된 형식과 입력된 형식이 일치하지 않는 경우 예외가 발생하므로 예외 처리 필요.
        try {
            // parse(String source)는 문자열을 날짜 Date인스턴스로 변환해준다.
            Date d = df.parse("2023년 1월 1일");
            System.out.println("d : " + d);
            System.out.println("df : " + df.format(d));
            System.out.println("df2 : " + df2.format(d));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
