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
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО

            int spaceOne = input.indexOf(" ");   //первый пробел
            int spaceTwo = input.indexOf(" ", spaceOne + 1); //второй пробел

            if (((input.indexOf(" ", spaceTwo + 1)) != -1)
                    || ((input.indexOf(" ", spaceOne + 1)) == -1)
                    || ((spaceTwo - spaceOne) < 1)) {
                System.out.println("Введенная строка не является ФИО");
                continue;
            }

            String surname = input.substring(0, spaceOne);
            String name = input.substring(spaceOne + 1, spaceTwo);
            String secondname = input.substring(spaceTwo + 1);

            if (stringValidation(surname) == false || stringValidation(secondname) == false || stringValidation(name) == false) {
                System.out.println("Введенная строка не является ФИО");
                continue;
            }
            System.out.println("Фамилия: " + surname + "\n" + "Имя: " + name + "\n" + "Отчество: " + secondname);
        }
    }

    public static boolean stringValidation(String text) {
        if (Character.isUpperCase(text.charAt(0))) {
            for (int i = 0; i < text.length(); i++) {
                int x = text.charAt(i);
                if ((x >= 1040) && (x <= 1103) || x == '-') {  // условие, что только текст кириллицей + "-"
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
}