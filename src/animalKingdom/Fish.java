package animalKingdom;


public class Fish extends Animals {


    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);

    }

    @Override
    public String moves() {
        return "swim";
    }
    @Override
    public String breathes() {
        return "gills";
    }
    @Override
    public String reproduces() {
        return "eggs";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getYearDiscovered() {
        return yearDiscovered;
    }
}
