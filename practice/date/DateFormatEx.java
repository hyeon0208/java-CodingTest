package date;

import java.text.SimpleDateFormat;
import java.util.Date;

 class DateFormatEx {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7;

        sdf1 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        sdf2 = new SimpleDateFormat("yy년, MMM d일, E요일");
        sdf3 = new SimpleDateFormat("zzzz - a h:mm ");
        sdf4 = new SimpleDateFormat("z K:mm a"); ////
        sdf5 = new SimpleDateFormat("G yyyy년.MMM.dd일 a hh:mm ");
        sdf6 = new SimpleDateFormat("yyyy MMM d일 E요일 HH:mm:ss Z");
        sdf7 = new SimpleDateFormat("yyyy MMM d일 E요일 kk:mm:ss Z");

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));
        System.out.println(sdf5.format(today));
        System.out.println(sdf6.format(today));
        System.out.println(sdf7.format(today));
    }
}
