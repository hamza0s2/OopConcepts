package nustLabSheetInheritance.ex2;

public class person
{
    private String Name;
    private String EmailAddress;
    private String Address;
    private String PhoneNumber;

    public person(String name, String address, String emailAddress, String phoneNumber)
    {
        setName(name);
        setAddress(address);
        setEmailAddress(emailAddress);
        setPhoneNumber(phoneNumber);
    }

    @Override
    public String toString() {
        return "person{" +
                "Name='" + Name + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getEmailAddress()
    {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        EmailAddress = emailAddress;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        Address = address;
    }

    public String getPhoneNumber()
    {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        PhoneNumber = phoneNumber;
    }
}
