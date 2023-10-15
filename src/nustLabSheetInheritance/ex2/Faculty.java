package nustLabSheetInheritance.ex2;


public class Faculty extends Employee
{
    private String officeHours;
    private String rank;
    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired, String officeHours, String rank)
    {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    @Override
    public String toString() { return "Faculty: " + super.getName(); }
}

