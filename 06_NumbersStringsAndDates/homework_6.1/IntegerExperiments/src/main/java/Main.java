public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        int sum = sumDigits(7843);
    }

    public static int sumDigits(Integer number) {
        if (number == null) {
            return -1;
        } else if (number == 0) {
            return 0;
        }
        int summa = 0;
        String string = Integer.toString(number);  
        for (int i = 0; i < string.length(); i++) { 
            char str = string.charAt(i); 
            String str1 = Character.toString(str); 
            Integer i1 = Integer.parseInt(str1); 
            summa = summa + i1;
        }
        return summa;
    }
}