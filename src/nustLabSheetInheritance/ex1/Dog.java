package nustLabSheetInheritance.ex1;

public class Dog extends Animal
{
    private String breed;

    public Dog(String name, String breed) {super(name); setBreed(breed);}

    @Override
    public void speak( ) {System.out.println("Dog Barks");}

    public String getBreed() {return breed;}

    public void setBreed(String breed) {this.breed = breed;}
}
