import javax.swing.*;
import java.awt.*;

public class GameStart extends JFrame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Game");
        jFrame.setContentPane(new GamePane());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(new Dimension(GamePane.getWIDTH(), GamePane.getHEIGHT()));
        jFrame.setVisible(true);

    }


}
