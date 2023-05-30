import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        java.text.DateFormat format = new SimpleDateFormat("HH:mm dd.MM.YYYY");
        Date date = new Date();

        System.out.println(format.format(date));
    }
}