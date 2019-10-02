package  animalKingdom;

public abstract class Animals
{
    private static int animalID = 0;
    int number;
    String name;
    int yearDiscovered;
    int fuel;

    public Animal(int number, String name, int yearDiscovered, int fuel)
    {
        animalID++;
        number = animalID;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.fuel = fuel;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    public int getFuel()
    {
        return fuel;
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
}