package J07028;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> listS=new ArrayList<>();
        int n=Integer.valueOf(scanner.nextLine());
        while (n-->0) {
            String s=scanner.nextLine();
            int x=s.indexOf(" ");
            listS.add(new Subject(s.substring(0, x), s.substring(x+1)));
        }

        Scanner sc=new Scanner(new File("GIANGVIEN.in"));
        n=Integer.valueOf(sc.nextLine());
        ArrayList<Teacher> listT=new ArrayList<>();
        ArrayList<String> listID=new ArrayList<>();
        while (n-->0) {
            String s=sc.nextLine();
            int x=s.indexOf(" ");
            listID.add(s.substring(0, x));
            listT.add(new Teacher(s.substring(0,x), s.substring(x+1)));
        }

        Scanner scc=new Scanner(new File("GIOCHUAN.in"));
        n=Integer.valueOf(scc.nextLine());
        while (n-->0) {
            String s[]=scc.nextLine().split("\\s+");
            int x=listID.indexOf(s[0]);
            listT.get(x).setTime(Double.valueOf(s[2]));
        }

        for (Teacher t : listT) {
            System.out.println(t);
        }
    }
}
