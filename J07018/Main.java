package J07018;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("SINHVIEN.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<SinhVien> list=new ArrayList<>();
        for(int j=1;j<=n;j++){
            String name="", str[]=scanner.nextLine().toUpperCase().trim().split("\\s+");
            String lop=scanner.nextLine(), dob=scanner.nextLine();
            double gpa=Double.valueOf(scanner.nextLine());
            for(int  i=0;i<str.length;i++){
                if(i!=str.length-1) name=name+str[i].charAt(0)+str[i].substring(1).toLowerCase()+" ";
                else name=name+str[i].charAt(0)+str[i].substring(1).toLowerCase();
            }
            if(dob.charAt(2)!='/') dob='0'+dob;
            if(dob.charAt(5)!='/') dob=dob.substring(0, 3)+'0'+dob.substring(3);
            list.add(new SinhVien(j,name,lop,dob,gpa));
        }
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
    }
}
