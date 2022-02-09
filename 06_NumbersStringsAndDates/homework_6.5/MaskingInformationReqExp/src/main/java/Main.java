public class Main {
    public static void main(String[] args) {
        System.out.println(searchAndReplaceDiamonds("Пин код <6160>", "***"));
    }

    // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        return text.replaceAll("[<]+[ 0-9]+[>]", placeholder);
    }
}