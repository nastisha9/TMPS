package OCP;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<Employee> Employees = Arrays.asList(new Employee("Ben", TypeEmployee.FRONTEND, 5000),
                new Employee("Dan", TypeEmployee.BACKEND, 5000));

        for (Employee employee : Employees) {
            System.out.println("Salary = " + employee.netSalary());
        }

    }
}
