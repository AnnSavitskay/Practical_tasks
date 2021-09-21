package prak_9_10;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args)
    {
        double income = 20000000;
        Company company = new Company(income);
        Employee[] employees = new Employee[270];
        for(int i = 0; i < 180; i++)
        {
            double base_salary;
            base_salary = (Math.random()*50000) + 20000;
            String str = Integer.toString(i);
            employees[i] = new Employee(str, str, base_salary, "Operator", company);
        }
        for (int i = 180; i < 260; i++)
        {
            double base_salary;
            base_salary = (Math.random()*50000) + 50000;
            String str = Integer.toString(i);
            employees[i] = new Employee(str, str, base_salary, "Manager", company);
        }

        for (int i = 260; i < 270; i++)
        {
            double base_salary;
            base_salary = (Math.random()*50000) + 100000;
            String str = Integer.toString(i);
            employees[i] = new Employee(str, str, base_salary, "TopManager", company);
        }

        company.hireAll(employees);
        System.out.println("The highest salaries in company");
        company.getTopSalaryStaff(15);
        System.out.println("The lowest salaries in company");
        company.getLowestSalaryStaff(30);

        for (int i = 0; i < 135; i++) {
            int in = (int)(Math.random() * 135);
            company.fire(in);
        }

        System.out.println("The highest salaries in company");
        company.getTopSalaryStaff(10);
        System.out.println("The lowest salaries in company");
        company.getLowestSalaryStaff(30);
    }
}
