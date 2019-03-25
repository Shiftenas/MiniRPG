import attacks.Element;

public class Attack {
    public static void attack(Fighter attacker, Fighter defender, Element element) {
        double multiplier = checkAvantage(element, defender);

        if (attacker.getElement().getElement() == element.getElement()) multiplier *= 1.5;

    }

    public static double checkAvantage(Element elementAttacker, Fighter defender) {
        Element elementDefender = defender.getElement();
        switch (elementAttacker.getElement()) {
            case Element.DARK:
                if (defender.getElement().getElement() == Element.LIGHT) return 2;
                return 1;
            case Element.LIGHT:
                if (defender.getElement().getElement() == Element.DARK) return 2;
                return 1;
            case Element.FIRE:
                if (defender.getElement().getElement() == Element.EARTH) return 2;
                if (defender.getElement().getElement() == Element.WATER) return 0.5;
                return 1;
            case Element.WATER:
                if (defender.getElement().getElement() == Element.FIRE) return 2;
                if (defender.getElement().getElement() == Element.EARTH) return 0.5;
                return 1;
            case Element.EARTH:
                if (defender.getElement().getElement() == Element.WATER) return 2;
                if (defender.getElement().getElement() == Element.FIRE) return 0.5;
                return 1;
            default:
                return 1;
        }
    }
}
