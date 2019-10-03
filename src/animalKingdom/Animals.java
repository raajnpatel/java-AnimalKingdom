package animalKingdom;


public abstract class Animals {


    private int maxId = 0;
    private int id;
    public int food = 0;
    public String name;
    public int yearDiscovered;
    public String moves;
    public String breathes;
    public String reproduces;


    public Animals (String name, int yearDiscovered) {
        maxId++;
        this.id = maxId;
        this.food = food;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.moves = moves;
        this.breathes = breathes;
        this.reproduces = reproduces;
    }


    public int eats(int n) {
        return this.food += n;
    }


    public abstract String getName();
    public abstract int getYearDiscovered();
    public abstract String moves();
    public abstract String breathes();
    public abstract String reproduces();


    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                ", breathes='" + breathes + '\'' +
                ", moves='" + moves + '\'' +
                ", reproduces='" + reproduces + '\'' +
                '}';
    }
}
