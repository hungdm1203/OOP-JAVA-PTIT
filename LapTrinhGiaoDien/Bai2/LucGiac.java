package Bai2;

import java.awt.*;

public class LucGiac extends HinhHoc{
    private final int WIDTH = 450;
    private final int HEIGHT = 450;
    public LucGiac(String type, Color color){
        super(type, color);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);

        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int) (Math.min(WIDTH, HEIGHT) * 0.4);

        Polygon polygon = new Polygon();

        polygon.addPoint(xCenter + radius, yCenter);
        polygon.addPoint((int) (xCenter + radius * Math.cos(2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(2 * Math.PI / 6)));
        polygon.addPoint((int) (xCenter + radius * Math.cos(2 * 2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(2 * 2 * Math.PI / 6)));
        polygon.addPoint((int) (xCenter + radius * Math.cos(3 * 2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(3 * 2 * Math.PI / 6)));
        polygon.addPoint((int) (xCenter + radius * Math.cos(4 * 2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(4 * 2 * Math.PI / 6)));
        polygon.addPoint((int) (xCenter + radius * Math.cos(5 * 2 * Math.PI / 6)), (int) (yCenter - radius * Math.sin(5 * 2 * Math.PI / 6)));

        if (type.equals("Dac"))
            g.fillPolygon(polygon);
        else
            g.drawPolygon(polygon);
    }
}
