package inheritance;
public class ParentClass {
    private int Id;
    private String name;

    public ParentClass(int Id, String name)
    {
       setId(Id);
       setName(name);
    }


    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}