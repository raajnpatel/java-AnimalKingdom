package animalKingdom;


public class Mammals extends Animals {


    public Mammals(String name, int yearDiscovered) {
        super(name, yearDiscovered);

    }

    @Override
    public String moves() {
        return "walk";
    }
    @Override
    public String breathes() {
        return "lungs";
    }
    @Override
    public String reproduces() {
        return "live births";
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
