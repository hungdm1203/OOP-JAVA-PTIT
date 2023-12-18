package J07060;

import java.io.*;
import java.util.*;

/**
 * sap xep lich thi
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("MONTHI.in"));
        ArrayList<MonThi> listM=new ArrayList<>();
        ArrayList<String> maMon=new ArrayList<>();
        int n=Integer.valueOf(sc.nextLine());
        while (n-->0) {
            String id=sc.nextLine();
            listM.add(new MonThi(id, sc.nextLine(), sc.nextLine()));
            maMon.add(id);
        }

        Scanner scanner=new Scanner(new File("CATHI.in"));
        ArrayList<CaThi> listC=new ArrayList<>();
        n=Integer.valueOf(scanner.nextLine());
        for(int i=1;i<=n;i++){
            listC.add(new CaThi(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Scanner scan=new Scanner(new File("LICHTHI.in"));
        n=Integer.valueOf(scan.nextLine());
        while (n-->0) {
            String s[]=scan.nextLine().split("\\s+");
            int x=Integer.valueOf(s[0].substring(1))-1, y=maMon.indexOf(s[1]);
            listC.get(x).set(listM.get(y),s[2],Integer.valueOf(s[3]));
        }

        Collections.sort(listC);
        for (CaThi caThi : listC) {
            System.out.println(caThi);
        }
    }
}