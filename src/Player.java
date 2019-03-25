import attacks.Element;
import features.WeaponClasses;

import java.util.Scanner;

public class Player extends Fighter {
    private Player(String _name, Element _element, int _hp, int _mana, WeaponClasses _class) {
        super(_name, _element, _hp, _mana, _class);
    }

    public static Player createPlayer(int hp, int mana) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer votre nom.");
        String name = sc.nextLine();
        System.out.println("Choisissez votre Element");
        String element = sc.nextLine();
        Element e;
        switch (element) {
            case "Fire":
                e = new Element(Element.FIRE);
                break;
            case "Water":
                e = new Element(Element.WATER);
                break;
            case "Earth":
                e = new Element(Element.EARTH);
                break;
            case "Light":
                e = new Element(Element.LIGHT);
                break;
            case "Dark":
                e = new Element(Element.DARK);
                break;
            default:
                e = new Element(Element.NONE);
                break;
        }
        System.out.println("Choisissez votre Classe");
        String clas = sc.nextLine();
        Player p;
        switch (clas) {
            case ("Mage") :
                p = new Player(name, e, hp, mana, WeaponClasses.MAGIC);
                break;
            case ("Magie") :
                p = new Player(name, e, hp, mana, WeaponClasses.MAGIC);
                break;
            case ("Magique") :
                p = new Player(name, e, hp, mana, WeaponClasses.MAGIC);
                break;
            case ("Archer") :
                p = new Player(name, e, hp, mana, WeaponClasses.BOW);
                break;
            case ("Arc") :
                p = new Player(name, e, hp, mana, WeaponClasses.BOW);
                break;
            case ("Gunslinger") :
                p = new Player(name, e, hp, mana, WeaponClasses.GUN);
                break;
            default :
                p = new Player(name, e, hp, mana, WeaponClasses.SWORD);
                break;
        }

        return p;
    }

    public String toString() {
        String text = super.toString();
        String recup = text.substring(text.indexOf('{'));
        return "Player{" + recup;
    }
}
