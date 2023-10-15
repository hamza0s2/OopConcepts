package inheritance;

public class circle extends shape
{
    private double radius;

    public circle(int id, double radius)
    {
        super(id);
        this.radius = radius;
    }

    public circle()
    {

    }


    @Override
    public String toString()
    {
        return "circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calculateArea()
    {
        System.out.println("Area has been calculated");
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
