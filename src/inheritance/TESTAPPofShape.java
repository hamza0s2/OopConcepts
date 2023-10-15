package inheritance;

public class TESTAPPofShape
{
    public static void main(String[] args)
    {
        PrintInfo(new rectangle(1,2.1,3.0),new rectangle(1,2.1,3.0),
                new rectangle(1,2.1,3.0),new rectangle(1,2.1,3.0)
        );

        shape shape2 = new rectangle();
        rectangle r = (rectangle) shape2;

        shape s1 = new shape(1);
        shape s2 = new shape(1);

        if(s1.equals(s2))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }

//        this is override equals method which checks the data , otherwise the default equal
//        method work same as == operator and check the reference of objects in memory.

    }


    public static void PrintInfo(shape... shapes)
    {
        int R = 0;
        int C = 0;

        for (shape shape : shapes)
        {
            if (shape instanceof rectangle)
            {
                System.out.println("Rectangle");
                rectangle r = (rectangle)shape;
                R++;
            }
            else if (shape instanceof circle)
            {
                System.out.println("Circle");
                C++;
                circle c = (circle) shape;
            }
        }
        System.out.println(R);
        System.out.println(C);
    }

    public static class inheritance extends ParentClass
    {
        private String courseName;

        public inheritance(int Id, String name, String courseName)
        {
            super(Id, name);
            setCourseName(courseName);
        }

        public String getCourseName()
        {
            return courseName;
        }

        public void setCourseName(String courseName)
        {
            this.courseName = courseName;
        }
    }
}
