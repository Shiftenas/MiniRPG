import attacks.Element;
import characters.Fighter;

public class Attack {
    public static void attack(Fighter attacker, Fighter defender, Element element) {
        double multiplier = checkAvantage(element, defender);

        if (attacker.getElement().getElement() == element.getElement()) multiplier *= 1.5;

        int damage;

        if (attacker.getWeapon() == null) damage = 0;
        else damage = attacker.getWeapon().getInitialDamage();
        if (attacker.getEquipement() != null) damage *= attacker.getEquipement().getBoost();

        damage *= multiplier;

        float defense = 1;

        if (defender.getHelmet() != null) defense += defender.getHelmet().getDefense();
        if (defender.getArmor() != null) defense += defender.getArmor().getDefense();
        if (defender.getLeggings() != null) defense += defender.getLeggings().getDefense();

        damage = Math.round(damage/defense);

        defender.hurt(damage);
    }

    public static double checkAvantage(Element elementAttacker, Fighter defender) {
        Element elementDefender = defender.getElement();
        switch (elementAttacker.getElement()) {
            case Element.DARK:
                if (elementDefender.getElement() == Element.LIGHT) return 2;
                return 1;
            case Element.LIGHT:
                if (elementDefender.getElement() == Element.DARK) return 2;
                return 1;
            case Element.FIRE:
                if (elementDefender.getElement() == Element.EARTH) return 2;
                if (elementDefender.getElement() == Element.WATER) return 0.5;
                return 1;
            case Element.WATER:
                if (elementDefender.getElement() == Element.FIRE) return 2;
                if (elementDefender.getElement() == Element.EARTH) return 0.5;
                return 1;
            case Element.EARTH:
                if (elementDefender.getElement() == Element.WATER) return 2;
                if (elementDefender.getElement() == Element.FIRE) return 0.5;
                return 1;
            default:
                return 1;
        }
    }
}
