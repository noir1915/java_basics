import java.util.*;

public class Company {
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }


    public void hire(Employee employee) {               // метод найма одного из сотрудников;
        employee.setCompany(this);
        employees.add(employee);
    }

    public void hireAll(List<Employee> employees) {           // метод найма всех сотрудников
        for (Employee e : employees) {
            hire(e);
        }
    }

    public void fire(Employee employee) {              //  увольнение сотрудников
        employees.remove(employee);
    }

    public int getIncome() {     //получения значения дохода компании
        int income = 0;
        for (Employee e : employees) {
            if (e instanceof Manager) {
                income += ((Manager) e).getSales();
            }
        }
        return income;
    }

    // Comparator применяется для отдельной логики
    // Comparable применяется для одного сравнения
    public List<Employee> getTopSalaryStaff(int count) {
        return getList(count, Comparator.reverseOrder());
    }

    public List<Employee> getLowesSalaryStaff(int count) {
        return getList(count, Comparator.naturalOrder());
    }

    private List<Employee> getList(int count, Comparator<Employee> cmp) {
        if (count < 0) {
            System.out.println("Передано неверное значение!");
            return Collections.emptyList();
        }
        if (count < employees.size()) {
            count = employees.size();
        }
        employees.sort(cmp);
        return new ArrayList<>(employees.subList(0, count));
    }
}