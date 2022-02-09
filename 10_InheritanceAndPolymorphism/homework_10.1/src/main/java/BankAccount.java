public class BankAccount {
    public double amount = 0;

    public static void main(String[] args) {

    }

    public double getAmount() { // сумма счета
        return amount;
    }

    public void put(double amountToPut) {  // метод пополнения счета
        if (amountToPut > 0)
            this.amount += amountToPut;
    }

    public boolean take(double amountToTake) {  //метод списания денег со счета
        if (getAmount() < amountToTake) { // если запрашиваемая сумма больше суммы на счете
            return false;
        }
        this.amount -= amountToTake;
        return true;
    }

    boolean send(BankAccount receiver, double amount) {
        if (take(amount)) {
            put(amount);
            System.out.println("Деньги успешно переведены");
            return true;
        }
        System.out.println("Ошибка");
        return false;
    }
}