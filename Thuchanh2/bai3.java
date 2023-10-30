package Thuchanh2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); scanner.nextLine();
        while (t-->0) {
            String str[]=scanner.nextLine().split("\\s+");
            for (int i = str.length-1; i >=0; i--) {
                System.out.print(str[i]+" ");
            }
            System.out.println();
        }
    }
}
