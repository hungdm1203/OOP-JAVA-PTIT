package J07074;

import java.io.*;
import java.util.*;

/**
 * lich giang day theo mon hoc
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> listM=new ArrayList<>();
        ArrayList<String> listID=new ArrayList<>();
        int n=Integer.valueOf(sc.nextLine());
        while (n-->0) {
            String id=sc.nextLine();
            listM.add(new MonHoc(id, sc.nextLine(), sc.nextLine()));
            listID.add(id);
        }
        
        Scanner scanner=new Scanner(new File("LICHGD.in"));
        n=Integer.valueOf(scanner.nextLine());
        ArrayList<HocPhan> listH=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s=scanner.nextLine();
            int x=listID.indexOf(s);
            listH.add(new HocPhan(i, listM.get(x), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(listH);
        String s=scanner.nextLine();
        int x=listID.indexOf(s);
        System.out.println("LICH GIANG DAY MON "+listM.get(x).getName()+":");
        for (HocPhan hocPhan : listH) {
            if(hocPhan.getMonHoc().getId().equals(s)) System.out.println(hocPhan);
        }
    }
}
