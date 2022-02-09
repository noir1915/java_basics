public class Main {
    public static void main(String[] args) {
        String text = "Номер кредитной карты <4008 1234 5678> 8912";
        System.out.println(searchAndReplaceDiamonds(text, "***"));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {

        while (text.contains("<")) {
            int firstDiamond = text.indexOf('<');
            if (firstDiamond == -1) {
                break;
            }
            int secondDiamond = text.indexOf('>');
            if (secondDiamond == -1) {
                break;
            }
            text = text.substring(0, firstDiamond) + placeholder + text.substring(secondDiamond + 1);
        }
        return text;
    }
}