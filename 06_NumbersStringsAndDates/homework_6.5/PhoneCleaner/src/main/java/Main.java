import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            String number = input.replaceAll("[ +()-]", "");
            if ((number.length() == 11) && (number.indexOf("7") == 0)) {
                System.out.println(number);
            }
            if (number.length() == 10) {
                System.out.println("7" + number);
            }
            if ((number.length() == 11) && (number.indexOf("8") == 0)) {
                System.out.println(number.replace("8", "7"));
            }
            if ((number.length() == 11) && (number.matches("[()]"))) {
                System.out.println(number);
            }
            if ((number.length() == 11) && ((number.indexOf("7") != 0) && (number.indexOf("8") != 0))) {
                System.out.println("Неверный формат номера");
            }
            if ((number.length() < 10) || (number.length() > 11)) {
                System.out.println("Неверный формат номера");
            }
        }
    }
}