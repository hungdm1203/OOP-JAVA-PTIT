package J04019;

public class Triangle {
    private Point A,B,C;

    public Triangle(Point p1, Point p2, Point p3) {
        this.A = p1;
        this.B = p2;
        this.C = p3;
    }

    public boolean valid(){
        double a=this.A.distance(this.B);
        double b=this.A.distance(this.C);
        double c=this.B.distance(this.C);
        if(a+b>c && a+c>b && b+c>a){
            return true;
        } else return false;
    }

    public String getPerimeter(){
        double a=this.A.distance(this.B);
        double b=this.A.distance(this.C);
        double c=this.B.distance(this.C);
        return String.format("%.3f", a+b+c);
    }
    
}
