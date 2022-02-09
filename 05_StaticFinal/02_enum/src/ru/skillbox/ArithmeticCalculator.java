public class ArithmeticCalculator {
    public int number1;
    public int number2;


    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calculate(Operation operation) {
        switch (operation) {
            case ADD:
                System.out.println(number1 + number2);
                break;
            case SUBTRACT:
                System.out.println(number1 - number2);
                break;
            case MULTIPLY:
                System.out.println(number1 * number2);
                break;
        }
    }
}