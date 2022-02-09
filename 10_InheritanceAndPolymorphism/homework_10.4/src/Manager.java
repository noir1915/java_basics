public class Manager extends Worker {

    public static final int MAX_FIX_SALARY = 140000;
    public static final int MIN_FIX_SALARY = 115000;
    private int sales = (int) (Math.random() * (MAX_FIX_SALARY - MIN_FIX_SALARY) + MIN_FIX_SALARY);

    public Manager(int salary) {
        super(salary);
    }

    @Override
    public int getMonthSalary() {
        return (int) (salary + 0.05 * sales);
    }

    public int getSales() {
        return sales;
    }
}