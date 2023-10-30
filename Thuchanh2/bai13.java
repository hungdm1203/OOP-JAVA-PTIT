package Thuchanh2;

import java.util.Scanner;

public class bai13 {
    static String a="2357";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=4;i<=n;i++) Try("",i);
    }

    public static void Try(String s,int n){
        if(s.length()==n){
            if(!s.endsWith("2") && s.contains("2") && s.contains("3") && s.contains("5") && s.contains("7")) System.out.println(s);
            return;
        }
        if(s.length()<n){
            Try((s+a.charAt(0)),n);
            Try((s+a.charAt(1)),n);
            Try((s+a.charAt(2)),n);
            Try((s+a.charAt(3)),n);
        }
    }
}
