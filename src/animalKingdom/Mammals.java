package  animalKingdom;

public class Mammal extends Animals
{

    public Mammal(String name, int yearDiscovered)
    {
        super(name, fuel, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }

    @Override
    public String toString()
    {
        return '\n' + "Mammal{" + "name=" + name +  ", fuel=" + fuel + ", year discovered=" + yearDiscovered + '}';
    }
}