import java.util.ArrayList;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;


public class Main {
public static void main(String[] args) {
        Worker worker1 = new Worker("Wojtek", 3500.0, 1, "01.01.2005", "Senior");
        Worker worker2 = new Worker("Wiesiek", 2500.0, 2, "10.05.2023", "Junior");
        Worker worker3 = new Worker("Zbyszek", 2100.0, 1, "11.10.2000", "Developer");

        Manager manager = new Manager("Janusz", 10000.0, 3, "12.12.1945", "Menago");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                               ", Position: " + employee.getPosition() + ", Hire date: " +
                               employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
        System.out.println(worker3.getName() + " equals worker3: " + worker3.equals(worker3));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager));
 
        }
    }
}