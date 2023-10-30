package J06004;

import java.util.*;

/**
 * quan li bai tap nhom-2
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

        Collections.sort(ds);
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }

        scanner.close();
    }
    
}
