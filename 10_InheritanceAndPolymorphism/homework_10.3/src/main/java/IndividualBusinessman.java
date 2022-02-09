public class IndividualBusinessman extends Client {
    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) {
            if (amountToPut < 1000) {
                this.amount += amountToPut - amountToPut * 0.01;
            } else
                this.amount += amountToPut - amountToPut * 0.005;
        } else System.out.println("Баланс не изменится");
    }
}
