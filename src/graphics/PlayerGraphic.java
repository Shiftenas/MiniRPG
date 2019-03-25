package graphics;

import characters.Player;
import features.WeaponClasses;

import javax.swing.*;
import java.awt.*;

public class PlayerGraphic extends JComponent {
    private Player player;
    private Dimension dimension;
    private JFrame mainFrame;
    /*
    * private final String MAGIC_SPRITE;
    * private final String MELEE_SPRITE;
    * private final String BOW_SPRITE;
    * private final String GUN_SPRITE;
    */
    public PlayerGraphic(Player _player, JFrame frame) {
        super();
        player = _player;
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        dimension.setSize(dimension.getWidth()/2,dimension.getHeight());
        mainFrame = frame;
    }

    public void makeGraphic() {
        WeaponClasses wClass = player.getWClass();
    }

}
