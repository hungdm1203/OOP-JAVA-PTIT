package J07038;
import java.io.*;
import java.util.*;

/*
 * danh sach thuc tap 3
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("SINHVIEN.in"));
        Scanner sc=new Scanner(new File("DN.in"));
        Scanner in=new Scanner(new File("THUCTAP.in"));
        ArrayList<SinhVien> dsSV=new ArrayList<>();
        ArrayList<DoanhNghiep> dsDN=new ArrayList<>();
        ArrayList<ThucTap> dsTT=new ArrayList<>();
        ArrayList<String> dsMSV=new ArrayList<>();
        ArrayList<String> dsID=new ArrayList<>();

        int t=Integer.valueOf(scanner.nextLine());
        while (t-->0) {
            String msv=scanner.nextLine();
            dsMSV.add(msv);
            dsSV.add(new SinhVien(msv, scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        t=Integer.valueOf(sc.nextLine());
        while (t-->0) {
            String id=sc.nextLine();
            dsID.add(id);
            dsDN.add(new DoanhNghiep(id, sc.nextLine(), Integer.valueOf(sc.nextLine())));
        }

        t=Integer.valueOf(in.nextLine());
        while (t-->0) {
            String str[]=in.nextLine().trim().split("\\s+");
            int x=dsMSV.indexOf(str[0]), y=dsID.indexOf(str[1]);
            dsTT.add(new ThucTap(dsSV.get(x), dsDN.get(y)));
        }

        t=Integer.valueOf(in.nextLine());
        Collections.sort(dsTT);
        while (t-->0) {
            String s=in.nextLine();
            int x=dsID.indexOf(s);
            System.out.println("DANH SACH THUC TAP TAI "+dsDN.get(x).getTenDN()+":");
            x=dsDN.get(x).getQuantity();
            for (ThucTap tt : dsTT) {
                if(s.equals(tt.getId())){
                    if(x>0){
                        System.out.println(tt);
                        x--;
                    } else break;
                }
            }
        }
    }
}