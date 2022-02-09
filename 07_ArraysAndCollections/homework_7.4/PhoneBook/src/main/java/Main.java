import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Введите номер, имя или команду:");
            String input = scanner.nextLine();
            if (input.matches("[А-Яа-я]+") && !phoneBook.mapPhoneBook.containsValue(input)) {
                System.out.println("Такого имени не существует");
                System.out.println("Введите номер телефона для абонента \"" + input + "\":");
                String inputTel = scanner.nextLine();
                phoneBook.addContact(inputTel, input);
                System.out.println("Контакт сохранен!");
                continue;
            } else if (input.matches("[0-9]{11}") && !phoneBook.mapPhoneBook.containsValue(input)) {
                System.out.println("Такого имени не существует");
                System.out.println("Введите номер телефона для абонента \"" + input + "\":");
                String inputName = scanner.nextLine();
                phoneBook.addContact(input, inputName);
                System.out.println("Контакт сохранен");
                continue;
            } else if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
                continue;
            } else if (!input.matches("[0-9]{11}") || !input.matches("[А-Яа-я]+}")) {
                System.out.println("Неверный формат ввода");
                continue;
            }
            if (input.equals("0")) {
                break;
            }
        }
    }
}
