package prak_9_10;

public class Manager implements EmployeePosition{
    public String getJobTitle()
    {
        return "Manager";
    }

    public double calcSalary(double baseSalary)
    {
        double company;
        company = (Math.random()*25000) + 115000;
        return 0.05*company + baseSalary;
    }
}
