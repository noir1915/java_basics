public class PhysicalPerson extends Client {
    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0)
        this.amount += amountToPut;
    }
}