import java.util.Scanner;

public class Main {
    private static final String ADD_COMMAND = "add Василий Петров " +
            "vasily.petrov@gmail.ru +79215637722";
    private static final String COMMAND_EXAMPLES = "\t" + ADD_COMMAND + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;
    private static final String helpText = "Command examples:\n" + COMMAND_EXAMPLES;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();

        while (true) {
            try {
                String command = scanner.nextLine();
                String[] tokens = command.split("\\s+", 2);
                switch (tokens[0]) {
                    case "add":
                        try {
                            executor.addCustomer(tokens[1]);
                        } catch (IllegalArgumentException exception) {
                            System.out.println("Передано неверное количество слов строке" + "\n" + helpText);
                        }
                        break;
                    case "list":
                        executor.listCustomers();
                        break;
                    case "remove":
                        try {
                            executor.removeCustomer(tokens[1]);
                        } catch (IllegalArgumentException ex) {
                            System.out.println(helpText);
                        }
                        break;
                    case "count":
                        System.out.println("There are " + executor.getCount() + " customers");
                        break;
                    case "help":
                        System.out.println(helpText);
                        break;
                    default:
                        System.out.println(COMMAND_ERROR);
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println(helpText);
            }
        }
    }
}