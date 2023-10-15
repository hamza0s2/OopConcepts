package nustLabSheetInheritance.ex4;

public class TestApp
{
    public static void main(String[] args)
    {
        HeartRates person = new HeartRates("ali", "ahmad", 2, 3, 2005);
        System.out.println(person.getFirstName() + person.getLastName());
        System.out.println(person.Age(person.getYear()));
        System.out.println(person.MaxHeart(person.Age(person.getYear())));
        person.TargetHeart(person.MaxHeart(person.Age(person.getYear())));
    }
}

