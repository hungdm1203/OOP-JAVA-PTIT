package Bai2;

import javax.swing.*;
import java.awt.*;

public abstract class Geometry extends JPanel{
    protected String type;
    protected Color color;

    public Geometry(String type, Color color){
        this.type = type;
        this.color = color;
    }
}
