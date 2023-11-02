package Bai2;

import javax.swing.*;
import java.awt.*;

public abstract class HinhHoc extends JPanel{
    protected String type;
    protected Color color;

    public HinhHoc(String type, Color color){
        this.type = type;
        this.color = color;
    }
}
