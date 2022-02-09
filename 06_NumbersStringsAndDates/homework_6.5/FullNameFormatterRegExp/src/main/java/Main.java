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
            String[] string = input.split(" ");
            if ((string.length == 3) && (input.matches("[\\W]+"))) { // если строка имеет в массиве 3 слова и содержит только буквы + символы верхнего и нижнего подчеркивания, тогда
                System.out.println("Фамилия: " + string[0] + "\n" + "Имя: " + string[1] + "\n" + "Отчество: " + string[2]);
            } else
                System.out.println("Введенная строка не является ФИО");
            break;
        }
    }
}