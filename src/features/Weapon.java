package features;

public class Weapon {
    private final WeaponClasses CLASS;
    private final int INITIAL_DAMAGE;
    private String name;

    public Weapon(String _name, WeaponClasses _class, int initial_damage) {
        name = _name;
        CLASS = _class;
        INITIAL_DAMAGE = initial_damage;
    }

    public int getInitialDamage() {
        return INITIAL_DAMAGE;
    }

    public WeaponClasses getWClass() {
        return CLASS;
    }
}
