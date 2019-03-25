import javax.swing.*;
import java.awt.*;

public class MainFrame {
    private JFrame mainFrame;
    private Dimension frameSize;

    public MainFrame(String title) {
        mainFrame = new JFrame(title);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameSize = Toolkit.getDefaultToolkit().getScreenSize();
    }

    public void mainRun() {
        //Player p = new Player()
    }
}
