import attacks.*;
import features.*;


public class Main {
    public static void main(String[] args) {
        Player player = Player.createPlayer(100,100);
        Fighter ennemy = new Fighter("Ennemy", new Element(Element.NONE), 50, 50, WeaponClasses.MAGIC);
        System.out.println(player);
    }
}