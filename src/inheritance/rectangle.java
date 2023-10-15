package inheritance;

public class rectangle extends shape
{
    private double height;
    private double width;

    public rectangle(int id, double height, double width)
    {
        super(id);
        this.height = height;
        this.width = width;
    }

    public rectangle()
    {

    }

    @Override
    public double calculateArea()
    {
        System.out.println("Area has been calculated");
        return getHeight() * getWidth();
    }


    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
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
