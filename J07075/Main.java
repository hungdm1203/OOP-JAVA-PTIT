package J07075;

import java.io.*;
import java.util.*;

/**
 * lich giang day theo giang vien
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("MONHOC.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<Monhoc> listM=new ArrayList<>();
        ArrayList<String> listID=new ArrayList<>();
        while (n-->0) {
            String id=scanner.nextLine();
            listID.add(id);
            listM.add(new Monhoc(id, scanner.nextLine(), scanner.nextLine()));
        }

        Scanner sc=new Scanner(new File("LICHGD.in"));
        n=Integer.valueOf(sc.nextLine());
        ArrayList<HocPhan> listHP=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String id=sc.nextLine();
            int x=listID.indexOf(id);
            listHP.add(new HocPhan(i, listM.get(x), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(listHP);
        String s=sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN "+s+":");
        for (HocPhan hocPhan : listHP) {
            if(hocPhan.getGv().equals(s)) System.out.println(hocPhan);
        }
    }
}