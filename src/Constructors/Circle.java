package Constructors;

public class Circle extends Shape
{
    private double radius;


    public Circle(double radius) {
        this(2,"hamz",2.0);
        this.radius = radius;
        System.out.println("Constructor 2 of Circle has been called");

    }

    public Circle(int id, String name, double radius) {
        super(id, name);
        System.out.println("Constructor of Circle has been called");
    }


    public Circle()
    {
        this( 0.0);
        System.out.println("Default Constructor of Circle has been called");

    }


}
