import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    System.out.println(calculateSalarySum(text));//
  }

  public static int calculateSalarySum(String text) {
    //TODO: реализуйте метод
    int sum = 0;
    Pattern p = Pattern.compile("\\d+"); // объект шаблона для поиска целочисленных значений
    Matcher m = p.matcher(text);  //объект класса с использованием метода matcher класса Pattern
    while (m.find()) {  //пока осуществляется поиск последовательности целочисленных значений
      sum += Integer.parseInt(m.group()); // происходит сложение и перевод последней символьнйо строки в число
    }
    return sum;
  }
}