import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Main {

    private static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        Employee employeeMaxSalary = findEmployeeWithHighestSalary(staff, 2017);
        System.out.println(employeeMaxSalary);
    }

    public static Employee findEmployeeWithHighestSalary(List<Employee> staff, int year) {
        Optional<Employee> optional = staff.stream().filter(employee -> convertToLocalDate(employee.getWorkStart()).getYear() == year).
                max(Comparator.comparing(Employee::getSalary));
        return optional.get();
    }

    public static LocalDate convertToLocalDate(Date date) {  // метод замены обычног представления Date на LocalDateTime
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }
}