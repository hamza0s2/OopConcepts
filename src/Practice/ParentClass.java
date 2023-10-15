package Practice;

public class ParentClass
{
    private String name;
    private int id;
   public static int counter = 0;
    protected int getCounter()
    {
        return counter++;
    }


    final int x=5;
    public ParentClass(String name)
    {
        this.name = name;
        id = counter++;
    }

    public ParentClass(int id)
    {
        this.id = counter++;
    }


    protected void setName(String name)
    {
        this.name = name;
    }

    protected  String getName()
    {
        return name;
    }

    protected void setId(int id)
    {
        this.id = id;
    }

    protected int getId()
    {
        return id;
    }

    public void sum(String a, int b)
    {
        System.out.println(a+b);
    }




}
