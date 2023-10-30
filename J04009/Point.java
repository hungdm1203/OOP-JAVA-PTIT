package J04009;

public class Point {
    private double x,y;

    public Point(){
        x=0;
        y=0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        p.x=this.x;
        p.y=this.y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
    }

    public double distance1(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
    
}
