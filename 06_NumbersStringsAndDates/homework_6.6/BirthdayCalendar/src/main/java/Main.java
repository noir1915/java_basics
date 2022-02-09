import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 1990;
        System.out.println(collectBirthdays(year, month, day));
    }
    //TODO реализуйте метод для построения строки в следующем виде
    //0 - 31.12.1990 - Mon
    //1 - 31.12.1991 - Tue
    public static String collectBirthdays(int year, int month, int day) {
        String result = "";
        int count = 0;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);   // создали объект календарь с входными параметрами
        DateFormat dateFormat = new SimpleDateFormat(" - dd.MM.yyyy - E", Locale.ENGLISH); // для форматирования даты
        while (calendar.before(new GregorianCalendar())) {
            result += count + dateFormat.format(calendar.getTime()) + System.lineSeparator();
            System.out.println(result);
            count++;
            calendar.add(Calendar.YEAR, 1);
        }


        return result;
    }
}
