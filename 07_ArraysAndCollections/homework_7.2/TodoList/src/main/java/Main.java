import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String input[] = string.split("\\s+");
        String command = input[0];
        String text = " ";
        int index = 0;

        if (command.equals("ADD")) {
            todoList.add(index, text);
        } else if (command.equals("EDIT")) {
            todoList.edit(text, index);
        } else if (command.equals("DELETE")) {
            todoList.delete(index);
        } else if (command.equals("LIST")) {
            System.out.println(todoList.getTodos());
        } else if (command.equals("0")) {
            System.out.println("Неверная команда");
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
