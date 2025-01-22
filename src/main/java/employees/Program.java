package employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int n = input.nextInt();
        input.nextLine();

        List<Employee> employees = new ArrayList<>();

        for (int i=0; i<n; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = input.nextInt();
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Salary: ");
            Double salary = input.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = input.nextInt();

        Employee employeeIncrease = new Employee();

        for(Employee emp : employees) {
            if(emp.getId() == idIncrease) {
                employeeIncrease = emp;
                break;
            }
        }

        if (employeeIncrease != null) {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            employeeIncrease.increaseSalary(percentage);
        }


        System.out.println("\nList of employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        input.close();

    }
}
