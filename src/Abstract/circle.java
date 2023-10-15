package Abstract;

public class circle extends shape implements interfaceExample
{
    private double radius;

    public circle(double radius)
    {
       setRadius(radius);
    }

    @Override
    public double calculateArea()
    {
        System.out.println("Circle");
        return Math.PI * getRadius() * getRadius();

    }
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
