package Bai2;

import java.awt.*;

public class Tron extends HinhHoc{
    private final int WIDTH = 450;
    private final int HEIGHT = 450;

    public Tron(String type, Color color){
        super(type, color);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        if (type.equals("Dac"))
            g.fillOval(getWidth() / 2 - WIDTH / 2, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
        else
            g.drawOval(getWidth() / 2 - WIDTH / 2, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
    }
}
