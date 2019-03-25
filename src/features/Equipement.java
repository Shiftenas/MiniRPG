package features;

public class Equipement {
    private final WeaponClasses CLASS;
    private final int BOOST;
    private String nom;

    public Equipement (WeaponClasses _class, int _boost, String _nom) {
        CLASS = _class;
        BOOST = _boost;
        nom = _nom;
    }

    public WeaponClasses getWClass() {
        return CLASS;
    }

    public int getBoost() {
        return BOOST;
    }

    public String getNom() {
        return nom;
    }
}
