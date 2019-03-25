package characters;

import javax.swing.*;
import java.awt.*;

public class PlayerGraphic extends JComponent {
    private Player player;
    private Dimension dimension;
    private JFrame mainFrame;

    public PlayerGraphic(Player _player, JFrame frame) {
        super();
        player = _player;
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        dimension.setSize(dimension.getWidth()/2,dimension.getHeight());
        mainFrame = frame;
    }

    public void makeGraphic() {

    }

}
