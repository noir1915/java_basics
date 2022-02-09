import java.util.*;

public class CoolNumbers {
    public static List<String> generateCoolNumbers() {
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        ArrayList<String> arrNumber = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            for (String a1 : letters) {
                for (String a2 : letters) {
                    for (String a3 : letters) {
                        for (int reg = 1; reg <= 100; reg++) {
                            arrNumber.add(String.format("%s%03d%s%s%d", a1, i, a2, a3, reg));
                        }
                    }
                }
            }
        }
        return arrNumber;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long start = System.nanoTime();
        boolean contains = list.contains(number);
        System.out.println(System.nanoTime() - start + " нс");
        return contains;
    }


    public static boolean binarySearchInList(List<String> sortedList, String number) {
        long start = System.nanoTime();
        boolean contains = Collections.binarySearch(sortedList, number) >= 0;
        System.out.println((System.nanoTime() - start) + " нс");
        return contains;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        long start = System.nanoTime();
        boolean contains = hashSet.contains(number);
        System.out.println((System.nanoTime() - start) + " нс");
        return contains;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        long start = System.nanoTime();
        boolean contains = treeSet.contains(number);
        System.out.println((System.nanoTime() - start) + " нс");
        return contains;
    }
}