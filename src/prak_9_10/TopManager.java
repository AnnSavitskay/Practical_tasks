package prak_9_10;

public class TopManager implements EmployeePosition{
    public Company company;
    public TopManager(Company company)
    {
        this.company = new Company();
        this.company = company;
    }

    public String getJobTitle()
    {
        return "TopManager";
    }

    public double calcSalary(double baseSalary)
    {
        if(!(this.company.getIncome() <= 10000000)) return baseSalary + 1.5*baseSalary;
        else return baseSalary;
    }
}
