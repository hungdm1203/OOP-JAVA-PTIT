package J07033;

import java.io.*;
import java.util.*;
/**
 * danh sach sinh vien trong file-1
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("SINHVIEN.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<SinhVien> ds=new ArrayList<>();
        while (t-->0) {
            String msv=scanner.nextLine(), s=scanner.nextLine(), lop=scanner.nextLine(), email=scanner.nextLine(), name="";
            String str[]=s.toLowerCase().trim().split("\\s+");
            for (int i=0;i<str.length;i++) {
                if(i!=str.length-1){
                    name=name+str[i].substring(0, 1).toUpperCase()+str[i].substring(1)+" ";
                } else name=name+str[i].substring(0, 1).toUpperCase()+str[i].substring(1);
            }
            ds.add(new SinhVien(msv,name,lop,email));
        }
        Collections.sort(ds);
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
    }
}