package  animalKingdom;

public abstract class Animals
{
    private static int animalID = 0;
    int number;
    String name;
    int yearDiscovered;

    public Animal(int number, String name, int yearDiscovered)
    {
        animalID++;
        number = animalID;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    public int eat()
    {
        return "Yum";
    }

    public int getNumber()
    {
        return number;
    }

    public String getName()
    {
        return name;
    }

    public int getYearDiscovered()
    {
        return yearDiscovered;
    }

    @Override
    public String toString()
    {
        return "Animals{" +
                "name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                ", breathes='" + breathes + '\'' +
                ", moves='" + moves + '\'' +
                ", reproduces='" + reproduces + '\'' +
                '}';
    }
}