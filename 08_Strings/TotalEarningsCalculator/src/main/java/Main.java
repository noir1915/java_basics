public class Main {
  public static void main(String[] args) {
    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    System.out.println(sumOfNumbers(text));//
  }

  public static int sumOfNumbers(String text) {  // метод сложения чисел
    int sum = 0;
    StringBuilder sb = new StringBuilder();
    for (char ch : text.toCharArray()) {
      if (Character.isDigit(ch)) { //проверка символа на цифру
        sb.append(ch); // добавляет в буффер цифру к числу
      } else if (sb.length() > 0) {
        sum += Integer.parseInt(sb.toString());//number увеличивает сумму
        sb.delete(0, sb.length()); // сбрасывает буффер для нового числа
      }
    }
    return sum;
  }
}