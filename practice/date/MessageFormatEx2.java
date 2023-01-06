package date;

import java.text.MessageFormat;

class MessageFormatEx2 {
    public static void main(String[] args) {
        String tableName = "CUST_INFO";
        // ` 홑 따욤표를 사용하기 위해선 두 번 연속으로 사용해야 한다.
        String msg = "INSERT INTO "+ tableName +" VALUES (''{0}'',''{1}'',{2},''{3}'');";

        Object[][] arguments = {
                {"성시경","02-123-1234", "27", "07-09"},
                {"김진표","032-333-1234", "33", "10-07"},
        };

        for(int i=0; i < arguments.length;i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}