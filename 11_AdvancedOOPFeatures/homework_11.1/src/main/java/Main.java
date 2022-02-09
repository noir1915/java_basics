import java.util.*;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        Collections.sort(staff, Comparator.comparing(Employee::getSalary, (o1, o2) -> o1.compareTo(o2))
                .thenComparing(Employee::getName, (o1, o2) -> o1.compareTo(o2)));
    }
}