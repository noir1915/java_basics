public abstract class Client {
    public double amount = 0;

    public double getAmount() {
        return amount;
    }

    public void put(double amountToPut) {  // внести деньги на счет
        if (amountToPut > 0) {
            this.amount += amountToPut;
        }
    }

    public boolean take(double amountToTake) {  //метод списания денег со счета
        if (getAmount() < amountToTake) { // если запрашиваемая сумма больше суммы на счете
            return false;
        }
        this.amount -= amountToTake;
        return true;
    }
}