package Practice;

public class ChildClass extends ParentClass
{
    private String fatherName;
    final int x= 4;
//     public static int counter = 2;
     int id;



    public ChildClass(String name , String fatherName, int id)
    {
        super(name);
        this.fatherName = getName();
        this.id = counter++;


    }

//    @Override
    public void sum(int b, String a)
    {
        System.out.println(a+b);
    }
}
