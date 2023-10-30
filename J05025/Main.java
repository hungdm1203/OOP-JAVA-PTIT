package J05025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * sap xep danh sach giang vien
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); scanner.nextLine();
        ArrayList<Teacher> arr=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            String fname=scanner.nextLine(), mon=scanner.nextLine(), tmp="";
            String a[]=fname.split("\\s+"), b[]=mon.split("\\s+");
            for (int j=0;j<b.length;j++) {
                tmp=tmp+b[j].toUpperCase().charAt(0);
            }
            arr.add(new Teacher(i,fname,tmp,a[a.length-1]));
        }
        Collections.sort(arr);
        for (Teacher teacher : arr) {
            System.out.println(teacher);
        }
        scanner.close();
    }
}


