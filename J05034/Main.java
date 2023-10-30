package J05034;

import java.util.*;

/**
 * danh sach thuc tap-1
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();scanner.nextLine();
        ArrayList<SinhVien> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ds.add(new SinhVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        Collections.sort(ds);
        int t=scanner.nextInt();scanner.nextLine();
        while(t-->0){
            String s=scanner.nextLine();
            for (SinhVien sinhVien : ds) {
                if(sinhVien.getCty().equals(s)) System.out.println(sinhVien);
            }
        }
        scanner.close();
    }
}


