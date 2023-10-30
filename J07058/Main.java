package J07058;

import java.util.*;
import java.io.*;

/**
 * danh sach mon thi
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException { 
        Scanner scanner=new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> arr=new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());
        while (n-->0) {
            MonThi monthi=new MonThi(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            arr.add(monthi);
        }
        Collections.sort(arr);
        for (MonThi i : arr) {
            System.out.println(i);
        }
    }
    
}