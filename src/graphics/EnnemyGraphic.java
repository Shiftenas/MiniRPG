package graphics;

import characters.Fighter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class EnnemyGraphic extends JComponent {
    private Fighter ennemy;
    private Dimension dimension;
    private double origin;
    private JFrame mainFrame;

    public EnnemyGraphic(Fighter _fighter, JFrame frame) {
        super();
        ennemy = _fighter;
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        dimension.setSize(dimension.getWidth()/2,dimension.getHeight());
        origin = dimension.getWidth();
        mainFrame = frame;
    }

    public void makeGraphic() {

    }

    public void KeyPressed(MouseEvent key) {
        double x = key.getX();
        double y = key.getY();

    }
}
