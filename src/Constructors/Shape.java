package Constructors;

public class Shape
{
    private int id;
    private String name;

    {
        System.out.println("Block of shape");

    }

    static {
        System.out.println("Static Block of shape");

    }

    public Shape(int id, String name)
    {
        this();
        this.id = id;
        this.name = name;
        System.out.println("constructor of shape");
    }

    public Shape()
    {
        System.out.println("default constructor of shape");

    }


}
