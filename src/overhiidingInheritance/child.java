package overhiidingInheritance;

public class child extends overriding
{
    private double salary;

    public child(int id, String name, double sales, double commission, double salary)
    {
        super(id, name, sales, commission);
        setSalary(salary);

    }

    @Override
    public double getEarning()
    {
        double earning = getSalary() + super.getEarning();
        return earning;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}



