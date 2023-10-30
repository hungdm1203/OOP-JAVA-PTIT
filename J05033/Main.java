package J05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * sap xep thoi gian
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<Times> arr=new ArrayList<>();
        while (t-->0) {
            int a=scanner.nextInt(), b=scanner.nextInt(), c=scanner.nextInt();
            Times times=new Times(a,b,c);
            arr.add(times);
        }
        Collections.sort(arr);
        for (Times times : arr) {
            System.out.println(times);
        }
        scanner.close();
    }
    
}