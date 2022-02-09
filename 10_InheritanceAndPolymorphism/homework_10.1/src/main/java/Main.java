public class Main {
    public static void main(String[] args) {
        CardAccount cardAccount = new CardAccount();
        cardAccount.take(2);
        BankAccount bankAccount = new BankAccount();
        BankAccount receiver = new BankAccount();
        bankAccount.send(receiver, 123);
    }
}
