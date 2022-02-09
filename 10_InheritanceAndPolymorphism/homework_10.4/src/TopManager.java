public class TopManager extends Worker {
    public static final int MIN_INCOME = 10_000_000;
    public static final double MULTIPLIER = 1.5;
    private int salary;
    private Company company;


    public TopManager(int salary, Company company) {
        super(salary);
        this.salary = (int) ((Math.random() * salary) + salary);
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        int salary = super.getMonthSalary();
        int income = company.getIncome();
        if (income > MIN_INCOME) {
            salary = (int) (salary * MULTIPLIER);
        }
        return salary;
    }

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }
}