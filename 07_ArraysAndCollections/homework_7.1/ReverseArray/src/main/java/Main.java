import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] lineSplit = line.split("\\s+");
        for (int i = 0; i < lineSplit.length; i++) {
            String[] reverse = ReverseArray.reverse(lineSplit); // добавляем в метод класса массив, где происходит его реверс
            System.out.println(Arrays.toString(reverse));  // вывод
        }
    }
}