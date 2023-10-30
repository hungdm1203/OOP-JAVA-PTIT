import java.util.*;

/**
 * khai bao lop nhan vien
 */


 class NhanVien {
    private String id,name,gt,ns,dc,mst,hd;

    public NhanVien(String name, String gt, String ns, String dc, String mst, String hd) {
        this.id = "00001";
        this.name = name;
        this.gt = gt;

        if(ns.charAt(2)!='/'){
            ns="0"+ns;
        }
        if(ns.charAt(5)!='/'){
            ns=ns.substring(0, 3)+"0"+ns.substring(3);
        }
        this.ns = ns;
        this.dc = dc;
        this.mst = mst;
        if(hd.charAt(2)!='/'){
            hd="0"+ns;
        }
        if(hd.charAt(5)!='/'){
            hd=hd.substring(0, 3)+"0"+hd.substring(3);
        }
        this.hd = hd;
    }


    @Override
    public String toString() {
        
        return id + " " + name + " " + gt + " " + ns + " " + dc + " " + mst + " " + hd;
    }   
    
}


public class J04007 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        NhanVien nv=new NhanVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(nv.toString());
        scanner.close();
    }
}