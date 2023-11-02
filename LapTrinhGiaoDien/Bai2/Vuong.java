package Bai2;

import java.awt.*;

public class Vuong extends HinhHoc{
    private final int WIDTH = 450;
    private final int HEIGHT = 450;

    public Vuong(String type, Color color){
        super(type, color);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        if (type.equals("Dac"))
            g.fillRect(getWidth() / 2 - WIDTH / 2, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
        else
            g.drawRect(getWidth() / 2 - WIDTH / 2, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
    }
}
