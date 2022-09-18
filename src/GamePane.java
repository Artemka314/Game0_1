import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePane extends JPanel {
    private static int HEIGHT;
    private static int WIDTH;

    private static Color color;


    GamePane() {
        color = Color.BLUE;
        HEIGHT = 400;
        WIDTH = 400;


    }

@Override
    public void paintComponent(Graphics g) {
    /* Сюда кладём все методы с рисованием
    конструкция не сеняема
     */

        super.paintComponent(g);
        draw(g);
    draw2(g);

    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public void draw(Graphics g) {

        g.setColor(color);
        g.drawRect(0, 0, 100, 100);


    }
    public void draw2(Graphics g) {

        g.setColor(color);
        g.drawRect(100, 100, 100, 100);


    }
}


