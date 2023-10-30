package J07055;

import java.io.*;
import java.util.*;
/*
 * xep loai
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("BANGDIEM.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<SinhVien> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String str[]=scanner.nextLine().toUpperCase().trim().split("\\s+");
            String res="";
            for (int j = 0; j < str.length; j++) {
                if(j!=str.length-1) res=res+str[j].charAt(0)+str[j].substring(1).toLowerCase()+" ";
                else res=res+str[j].charAt(0)+str[j].substring(1).toLowerCase();
            }
            list.add(new SinhVien(i, res, Double.valueOf(scanner.nextLine()), Double.valueOf(scanner.nextLine()), Double.valueOf(scanner.nextLine())));
        }

        Collections.sort(list);
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
    }
    
}
