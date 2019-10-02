package  animalKingdom;

public class Bird extends Animals
{

    public Bird(String name, int yearDiscovered)
    {
        super(name, fuel, yearDiscovered);
    }

    @Override
    public String move()
    {
        return "fly";
    }

    @Override
    public String breathe()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return '\n' + "Bird{" + "name=" + name + ", fuel=" + fuel + ", year discovered=" + yearDiscovered + '}';
    }
}

}