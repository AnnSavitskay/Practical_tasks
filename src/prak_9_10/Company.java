package prak_9_10;

import java.util.ArrayList;
import java.util.Comparator;

public class Company {
    protected double income;
    protected ArrayList<Employee> employees;

    public Company(){}
    public Company(double income)
    {
        this.income = income;
        this.employees = new ArrayList<Employee>();
    }
    public Company(Employee[] employees, double income)
    {
        this.income = income;
        this.employees = new ArrayList<Employee>();
        for(int i = 0; i < employees.length; i++)
        {
            this.employees.add(employees[i]);
        }
    }

    public void hire(Employee employee)
    {
        employees.add(employee);
    }

    public void hireAll(Employee[] employees)
    {
        for (int i = 0; i < employees.length; i++)
        {
            this.employees.add(employees[i]);
        }
    }

    public void fire(int i)
    {
        this.employees.remove(i);
    }

    public double getIncome()
    {
        return income;
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count)
    {
        ArrayList<Employee> employees1 = new ArrayList<Employee>();
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
        if((count <= 0) || (count > employees.size()))
        {
            System.out.println("Wrong count");
        }

        else
        {
            for (int i = 0; i < count; i++)
            {
                employees1.add(employees.get(i));
            }
            this.print_salary(count);
        }

        return employees1;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count)
    {
        ArrayList<Employee> employees1 = new ArrayList<Employee>();
        employees.sort(Comparator.comparing(Employee::getSalary));
        if((count <= 0) || (count > employees.size()))
        {
            System.out.println("Wrong count");
        }

        else
        {
            for (int i = 0; i < count; i++)
            {
                employees1.add(employees.get(i));
            }
            this.print_salary(count);
        }

        return employees1;
    }

    public void print_salary(int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(employees.get(i).getSalary());
        }
    }
}
