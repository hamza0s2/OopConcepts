package nustLabSheetInheritance.ex2;


public class Employee extends person
{
    private String office;
    private double salary;
    private String dateHired;
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired)
    {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    @Override
    public String toString() { return "Employee: " + super.getName(); }
}
