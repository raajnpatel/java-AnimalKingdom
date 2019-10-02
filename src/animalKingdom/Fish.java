package  animalKingdom;

public class Fish extends Animals
{

    public Fish(String name, int yearDiscovered)
    {
        super(name, fuel, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "swim";
    }

    @Override
    public String breathe()
    {
        return "gills";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return '\n' + "Fish{" + "name=" + name + ", fuel=" + fuel + ", year discovered=" + yearDiscovered + '}';
    }
}