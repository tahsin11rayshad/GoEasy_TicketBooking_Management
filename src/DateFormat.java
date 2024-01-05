import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static String getFormattedDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }
}
