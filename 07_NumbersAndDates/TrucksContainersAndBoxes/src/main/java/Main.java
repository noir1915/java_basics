import java.util.Scanner;

public class Main {

    public static int boxesInContainer = 27;
    public static int containerNumber = 1;
    public static int containerInTruck = 12;
    public static int truckNumber = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();
        int box = Integer.parseInt(boxes); // переводим из строки в число
        if (box > 0) {
            System.out.println("Грузовик: " + truckNumber + "\n" + "\t" + "Контейнер: " + containerNumber);
            for (int boxNumber = 1; boxNumber <= box; boxNumber++) {
                System.out.println("\t\t" + "Ящик: " + boxNumber);
                if (boxNumber % (containerInTruck * boxesInContainer) == 0) {
                    truckNumber++;
                    System.out.println("Грузовик: " + truckNumber);
                }
                if ((boxNumber % boxesInContainer) == 0) {
                    if (box == boxesInContainer) {
                        break;
                    }
                    containerNumber += 1;
                    System.out.println("\t" + "Контейнер: " + containerNumber);
                }
            }
            System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + truckNumber + " шт." + System.lineSeparator() + "контейнеров - " + containerNumber + " шт.");
        } else {
            System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + 0 + " шт." + System.lineSeparator() + "контейнеров - " + 0 + " шт.");
        }
    }
}
