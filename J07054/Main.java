package J07054;

import java.io.*;
import java.util.*;

/**
 * tinh diem trung binh
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("BANGDIEM.in"));
        int t=Integer.valueOf(scanner.nextLine().trim());
        ArrayList<SinhVien> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ds.add(new SinhVien(i, scanner.nextLine().trim(), Double.valueOf(scanner.nextLine().trim()), Double.valueOf(scanner.nextLine().trim()), Double.valueOf(scanner.nextLine().trim())));
        }
        Collections.sort(ds);
        double tmp=0;
        int a[]=new int[t];
        a[0]=1;
        for (int i=0;i<t;i++) {
            if(ds.get(i).getTb()!=tmp){
                tmp=ds.get(i).getTb();
                System.out.println(ds.get(i)+" "+(i+1));
                a[i]=i+1;
            } else{
                a[i]=a[i-1];
                System.out.println(ds.get(i)+" "+a[i]);
            }
        }
    }
}
