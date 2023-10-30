import java.util.Scanner;

/**
 * chu vi tam giac
 */
public class J04008 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            Point p1=new Point(scanner.nextDouble(), scanner.nextDouble()), p2=new Point(scanner.nextDouble(), scanner.nextDouble()), p3=new Point(scanner.nextDouble(), scanner.nextDouble());
            if (p1.distance(p2)+p1.distance(p3) > p2.distance(p3) && p1.distance(p3)+p2.distance(p3) > p1.distance(p2) && p1.distance(p2)+p2.distance(p3)> p1.distance(p3)){
                System.out.printf("%.3f\n", p1.distance(p3)+p1.distance(p2)+p2.distance(p3));
            } else System.out.println("INVALID");
        }
        scanner.close();
    }
}

class Point{
    private double x,y;


    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(Point p){
        p.x=this.x;
        p.y=this.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
    }    


    public double distanceP(Point p1,Point p2){
        return Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    

}