package animalKingdom;


public class Birds extends Animals {


    public Birds(String name, int yearDiscovered) {
        super(name, yearDiscovered);

    }

    @Override
    public String moves() {
        return "fly";
    }
    @Override
    public String breathes() {
        return "lungs";
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
