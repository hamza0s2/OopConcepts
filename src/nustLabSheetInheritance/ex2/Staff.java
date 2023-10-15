package nustLabSheetInheritance.ex2;


public class Staff extends Employee
{
    private String title;
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired, String title)
    {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }
    @Override
    public String toString() { return "Staff: " + super.getName(); }
}
