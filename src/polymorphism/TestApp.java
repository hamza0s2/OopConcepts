package polymorphism;

public class TestApp
{
    public static void main(String[] args)
    {
        shape s1 = new rectangle(2, 4);
        System.out.println(s1.calculateArea());
    }
}
