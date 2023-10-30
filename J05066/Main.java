package J05066;

import java.util.*;
/*
 * tim kiem nhan vien theo ten
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); scanner.nextLine();
        ArrayList<NhanVien> ds=new ArrayList<>();
        while (n-->0) {
            String a=scanner.nextLine();
            int x=a.indexOf(" ");
            String id=a.substring(0, x), name=a.substring(x+1);
            ds.add(new NhanVien(id,name));
        }

        Collections.sort(ds);
        n=scanner.nextInt(); scanner.nextLine();
        while (n-->0) {
            String s=scanner.nextLine().toLowerCase();
            for (NhanVien nhanVien : ds) {
                if(nhanVien.getName().contains(s)) System.out.println(nhanVien);
            }
            System.out.println();
        }
        scanner.close();
    }
}

