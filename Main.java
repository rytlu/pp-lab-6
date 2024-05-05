import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
        Worker worker1 = new Worker("Wojtek", 3500.0, 1, "01.01.2005", "Senior");
        Worker worker2 = new Worker("Wiesiek", 2500.0, 2, "10.05.2023", "Junior");
        Worker worker3 = new Worker("Zbyszek", 2100.0, 3, "11.10.2000", "Developer");
        Worker worker4 = new Worker("Stasiek", 2600.0, 4, "20.12.2002", "Senior");

        Manager manager = new Manager("Janusz", 10000.0, 5, "12.12.1945", "Menago");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                               ", Position: " + employee.getPosition() + ", Hire date: " +
                               employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");
        }
    }
}