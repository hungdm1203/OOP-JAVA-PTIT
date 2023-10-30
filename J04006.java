import java.util.*;

/**
 * khai bao lop sinh vien
 */

public class J04006 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SinhVien sv=new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextFloat());
        System.out.println(sv.toString());
        
        scanner.close();
    }
}


class SinhVien{
    private String id,name,lop,ns;
    private float gpa;

    public SinhVien(String name, String lop, String ns, float gpa) {
        this.id="B20DCCN001";
        this.name = name;
        this.lop = lop;
        if(ns.charAt(2)!='/'){
            ns="0"+ns;
        }
        if(ns.charAt(5)!='/'){
            ns=ns.substring(0, 3)+"0"+ns.substring(3);
        }
        this.ns=ns;//new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa=gpa;
    }

    @Override
    public String toString() {
        return id +" " + name + " " + lop + " " + ns + " " + String.format("%.2f", gpa);
    }
}