import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome; // переменная дата последнего пополнения

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) {
            this.amount += amountToPut;
            this.lastIncome = LocalDate.now();
        }
    }

    @Override
    public boolean take(double amountToTake) {
        if (amountToTake < amount && lastIncome.plus(1, ChronoUnit.MONTHS).isBefore(LocalDate.now())) {
            this.amount -= amountToTake; // если снимается меньше денег, чем есть и дата списания денег находится в пределах месяца после пополнения
            return true;
        } else {
            return false;
        }
    }
}