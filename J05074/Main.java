package J05074;
import java.util.*;

/**
 * diem danh-1
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); scanner.nextLine();
        ArrayList<SinhVien> ds=new ArrayList<>();
        ArrayList<String> dsMSV=new ArrayList<>();
        for(int i=0;i<t;i++) {
            String msv=scanner.nextLine();
            ds.add(new SinhVien(msv, scanner.nextLine(), scanner.nextLine()));
            dsMSV.add(msv);
        }

        while (t-->0) {
            String tmp[]=scanner.nextLine().split("\\s+");
            int i=dsMSV.indexOf(tmp[0]);
            ds.get(i).setCC(tmp[1]);
        }

        String s=scanner.nextLine();

        for (SinhVien sv : ds) {
            if(sv.getLop().equals(s)) System.out.println(sv);
        }
        scanner.close();
    }
    
}

