package Bai7_J07057;

import java.io.*;
import java.util.*;
import javax.swing.*;
import Bai7_J07057.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("C:\\WORKSPACE\\Java\\LapTrinhGiaoDien\\Bai7_J07057\\THISINH.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<ThiSinh> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String str[]=scanner.nextLine().toUpperCase().trim().split("\\s+");
            String res="";
            for (int j = 0; j < str.length; j++) {
                if(j!=str.length-1) res=res+str[j].charAt(0)+str[j].substring(1).toLowerCase()+" ";
                else res=res+str[j].charAt(0)+str[j].substring(1).toLowerCase();
            }
            list.add(new ThiSinh(i, res, Double.valueOf(scanner.nextLine()), scanner.nextLine(), Integer.valueOf(scanner.nextLine())));
        }

        MyFrame mf=new MyFrame("Lam bai cho vui", list);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mf.setSize(600,400);
        
        
    }
    
}