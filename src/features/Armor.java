package features;

public abstract class Armor {
    private final int DEFENSE;
    private String name;
    //private String appearance


    Armor(String _name, int _defense) {
        name = _name;
        DEFENSE = _defense;
    }

    public int getDefense() {
        return DEFENSE;
    }

    public String getName() {
        return name;
    }
}
