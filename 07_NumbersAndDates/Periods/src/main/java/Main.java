import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        getPeriodFromBirthday(LocalDate.of(1995, 5, 23));
        /**
         * 23 мая 1995 года, дата основания JAVA(JVM)
         */
    }

    private static String getPeriodFromBirthday(LocalDate birthday) {
        LocalDate now = LocalDate.now();  // нынешняя дата
        Period diff = Period.between(birthday, now); // добавлен класс Period
        System.out.printf("Date Difference is %d years, %d months and %d days old",
                diff.getYears(), diff.getMonths(), diff.getDays()); // вывод
        return "";
    }
}