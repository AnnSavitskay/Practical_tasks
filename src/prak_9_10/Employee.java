package prak_9_10;

public class Employee {
    protected String second_name;
    protected String first_name;
    protected double base_salary;
    protected EmployeePosition position;
    protected Company company;
    protected double salary;

    public Employee(String second_name, String first_name, double base_salary, String position, Company company)
    {
        this.company = new Company();
        this.company = company;
        this.second_name = second_name;
        this.first_name = first_name;
        this.base_salary = base_salary;
        if(position == "Manager") {
            this.position = new Manager();
            salary = this.position.calcSalary(base_salary);
        }
        if(position == "TopManager") {
            this.position = new TopManager(this.company);
            salary = this.position.calcSalary(base_salary);
        }
        if(position == "Operator") {
            this.position = new Operator();
            salary = this.position.calcSalary(base_salary);
        }
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public double getBase_salary() {
        return base_salary;
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public String toString()
    {
        return "The employee is " + position.getJobTitle() + " his second name is " + second_name + " his first name " + first_name +
                " his salary is " + salary;
    }
}
