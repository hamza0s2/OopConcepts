package inheritance;

public class shape
{
    private int id;

    public shape()
    {

    }

    public shape(int id)
    {
        setId(id);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double calculateArea()
    {
        System.out.println("Area has been calculated");
        return 0;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null)
            return false;
        if(o instanceof shape)
        {
            shape s = (shape) o;
            if(this.getId() == s.getId())
            {
                return true;
            }
        }
        return false;
    }

}
