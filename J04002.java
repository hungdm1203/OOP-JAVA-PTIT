import java.util.Scanner;

/**
 * khai bao lop hinh chu nhat
 */
public class J04002 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double width=scanner.nextDouble(), height=scanner.nextDouble();
        String color=scanner.next();
        if(width>0 && height>0){
            Rectange hcn=new Rectange(width, height, color);
            System.out.printf("%.0f %.0f %s",hcn.findPerimeter(),hcn.findArea(),hcn.getColor());
        } else System.out.println("INVALID");
        scanner.close();
    }
}



class Rectange {
    private double width,height;
    private String color;
    
    
    public Rectange(){
        width=1;
        height=1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color.substring(0, 1).toUpperCase()+color.substring(1).toLowerCase();
    }
    
    public double findArea(){
        return this.width*this.height;
    }
    
    public double findPerimeter(){
        return (this.width+this.height)*2;
    }
    
}