import java.util.ArrayList;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;


public class Main {
public static void main(String[] args) {
        Worker worker1 = new Worker("Wojtek", 3500.0, 1, "01.01.2005", "Senior");
        Worker worker2 = new Worker("Wiesiek", 2500.0, 2, "10.05.2023", "Junior");
        Worker worker3 = new Worker("Zbyszek", 2100.0, 1, "11.10.2000", "Developer");
        Worker worker4 = new Worker("Stasiek", 2600.0, 3, "20.12.2002", "Senior");
        Worker worker5 = new Worker("Mietek", 3500.0, 4, "01.01.2005", "Senior");
        Worker worker6 = new Worker("Janina", 2500.0, 5, "10.05.2023", "Junior");
        Worker worker7 = new Worker("Karyna", 2100.0, 1, "11.10.2000", "Developer");

        Manager manager1 = new Manager("Janusz", 10000.0, 3, "12.12.1945", "Menago");
        Manager manager2 = new Manager("Wieslaw", 21000.0, 3, "12.12.1845", "Glowny menago");
        Manager manager3 = new Manager("Boleslaw", 51000.0, 3, "12.12.1445", "Emeryt menago");
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(worker7);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                               ", Position: " + employee.getPosition() + ", Hire date: " +
                               employee.getHireDate() + ", Salary: " + employee.getSalary() + ")");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(worker4.getName() + " has code: " + worker4.hashCode());
        System.out.println(worker5.getName() + " has code: " + worker5.hashCode());
        System.out.println(worker6.getName() + " has code: " + worker6.hashCode());
        System.out.println(worker7.getName() + " has code: " + worker6.hashCode());
        System.out.println(manager1.getName() + " has code: " + manager1.hashCode());
        System.out.println(manager2.getName() + " has code: " + manager2.hashCode());
        System.out.println(manager3.getName() + " has code: " + manager3.hashCode());

        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker1));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker2));
        System.out.println(worker3.getName() + " equals worker3: " + worker3.equals(worker3));
        System.out.println(worker3.getName() + " equals worker1: " + worker3.equals(worker4));
        System.out.println(worker3.getName() + " equals worker2: " + worker3.equals(worker5));
        System.out.println(worker3.getName() + " equals worker3: " + worker3.equals(worker6));
        System.out.println(worker3.getName() + " equals worker3: " + worker3.equals(worker7));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager1));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager2));
        System.out.println(worker3.getName() + " equals manager: " + worker3.equals(manager3));

        }
    }
}