package polymorphism;

public class circle extends shape
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
