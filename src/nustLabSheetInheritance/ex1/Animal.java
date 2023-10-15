package nustLabSheetInheritance.ex1;

public class Animal
{
    private String name;

    public Animal(String name) {setName(name);}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public void speak()
    {
        System.out.println("An Animal makes a sound");
    }
}
