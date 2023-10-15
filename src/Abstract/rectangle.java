package Abstract;

public class rectangle extends shape
{
    private double length;
    private double width;

    public rectangle(double length, double width)
    {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double calculateArea()
    {
        System.out.println("Rectangle");
        return getLength() * getWidth();
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }
}
