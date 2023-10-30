package J05026;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * danh sach giang vien theo bo mon
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();scanner.nextLine();
        ArrayList<GiangVien> ds=new ArrayList<>();
        for (int i=1;i<=t;i++) {
            ds.add(new GiangVien(i,scanner.nextLine(),scanner.nextLine().toLowerCase()));
        }
        
        int q=scanner.nextInt();scanner.nextLine();
        while (q-->0) {
            String s=scanner.nextLine().toLowerCase();
            String arr[]=s.split("\\s+"), tmp="";
            for (String string : arr) {
                tmp=tmp+string.toUpperCase().charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+tmp+":");
            for(GiangVien gv:ds){
                if(gv.getSub().equals(s)){
                    System.out.println(gv+" "+tmp);
                }
            }
        }
        scanner.close();
    }
}


