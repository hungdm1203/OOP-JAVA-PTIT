package Thuchanh2.bai9;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DANHSACH.in"));
        ArrayList<Sinhvien> list=new ArrayList<>();
        ArrayList<String> listMSV=new ArrayList<>();

        while (scanner.hasNextLine()) {
            String msv=scanner.nextLine();
            listMSV.add(msv);
            list.add(new Sinhvien(msv,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }

        Scanner sc=new Scanner(new File("HUONGDAN.in"));
        int n=Integer.valueOf(sc.nextLine());
        while (n-->0) {
            String str[]=sc.nextLine().split("\\s+");
            String res="";
            for(int i=0;i<str.length-1;i++){
                if(i!=str.length-2) res+=str[i]+" ";else res+=str[i];
            }

            for(int i=0;i<Integer.valueOf(str[str.length-1]);i++){
                String tmp=sc.nextLine();
                int k=tmp.indexOf(" ");
                int x=listMSV.indexOf(tmp.substring(0, k));
                list.get(x).setDoan(res,tmp.substring(k+1));
            }
        }

        Collections.sort(list);
        for (Sinhvien sinhvien : list) {
            if(sinhvien.getDOAN()!="") System.out.println(sinhvien);
        } 
    }
}
