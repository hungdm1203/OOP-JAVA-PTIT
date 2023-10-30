package J05028;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); 
        ArrayList<DoanhNghiep> arr=new ArrayList<>();
        while (t-->0) {
            scanner.nextLine();
            arr.add(new DoanhNghiep(scanner.nextLine(),scanner.nextLine(),scanner.nextInt()));
        }
        Collections.sort(arr);
        for (DoanhNghiep doanhNghiep : arr) {
            System.out.println(doanhNghiep);
        }
        scanner.close();
    }
}

