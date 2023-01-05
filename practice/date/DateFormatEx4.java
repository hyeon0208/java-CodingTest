package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner input = new Scanner(System.in);

        Date inputDate = null;

        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예:2023/12/31)");
        // hasNextLine()은 다음에 읽을 값이 있는지 확인한다.
        while (input.hasNextLine()) {
            try {
                inputDate = df.parse(input.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력예:2023/12/31)");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inputDate);

        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);

        System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
    }
}