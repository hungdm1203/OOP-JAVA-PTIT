package J06003;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * quan li bai tap nhom-1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(), m=scanner.nextInt();
        ArrayList<SinhVien> ds=new ArrayList<>();
        
        while(n-->0){
            scanner.nextLine();
            ds.add(new SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextInt()));
        }

        scanner.nextLine();
        for(int i=1;i<=m;i++){
            String s=scanner.nextLine();
            for (SinhVien sv : ds) {
                if(i==sv.getNhom()){
                    sv.setBTL(s);;
                }
            }
        }

        int q=scanner.nextInt();
        while (q-->0) {
            int t=scanner.nextInt();
            String res="";
            System.out.println("DANH SACH NHOM "+t+":");
            for (SinhVien sv : ds) {
                if(t==sv.getNhom()) {
                    System.out.println(sv);
                    res=sv.getBTL();
                }
            }
            System.out.println("Bai tap dang ky: "+res);
        }

        scanner.close();
    }
    
}
