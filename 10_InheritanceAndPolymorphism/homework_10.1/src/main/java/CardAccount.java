public class CardAccount extends BankAccount {
    @Override
    public boolean take(double amountToTake) {
        if (getAmount() < amountToTake) {
            return  false;
        }
        this.amount -= (amountToTake + (amountToTake * 0.01));
        return true;
    }
}