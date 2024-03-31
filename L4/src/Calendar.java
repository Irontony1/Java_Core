import java.time.LocalDateTime;

public class Calendar {
    public static String getTime(){
        LocalDateTime now = LocalDateTime.now();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        return String.format("%02d-%02d", day, month);
    }
}
