package J04019;

import java.util.Scanner;

public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner scanner){
        return new Point(scanner.nextDouble(),scanner.nextDouble());
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)+ Math.pow(this.y-p.y, 2));
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    
    
}