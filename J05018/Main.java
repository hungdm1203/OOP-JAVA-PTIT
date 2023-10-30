package J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<HocSinh> dsHS=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            scanner.nextLine();
            String name=scanner.nextLine();
            double a[]=new double[10], dtb=0;
            for (int j=0;j<10;j++) {
                a[j]=scanner.nextDouble();
                if(j==0||j==1)
                    dtb=dtb+a[j]*2;
                else dtb=dtb+a[j];    
            }
            dtb=Math.round(dtb*10/12.0)/10.0;
            HocSinh hs=new HocSinh(i,name,dtb);
            dsHS.add(hs);
        }
        Collections.sort(dsHS);
        for (HocSinh hocSinh : dsHS) {
            System.out.println(hocSinh);
        }
        scanner.close();
    }
}
