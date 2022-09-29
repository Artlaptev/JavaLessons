import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Task1 {
    private static TimeInterval _morning = new TimeInterval(new Time(5, 0), new Time(11, 59));
    private static TimeInterval _day = new TimeInterval(new Time(12, 0), new Time(17, 59));
    private static TimeInterval _evening = new TimeInterval(new Time(18, 0), new Time(22, 59));
    private static TimeInterval _night = new TimeInterval(new Time(23, 0), new Time(4, 59));

    public static String sayHello(String name) {
        LocalTime localTime = LocalTime.now();
        StringBuilder sb = new StringBuilder(name);

        Time now = new Time(localTime.getHour(), localTime.getMinute());
        if (_morning.containsTime(now))
            return "Доброе утро, " + name;
        if (_day.containsTime(now))
            return "Добрый день, " + name;
        if (_evening.containsTime(now))
            return "Добрый вечер, " + name;
        if (_night.containsTime(now))
            return "Доброй ночи, " + name;
        return "";
    }

    public static void main(String[] args) {
        System.out.println(sayHello("Вениамин"));

    }

}
