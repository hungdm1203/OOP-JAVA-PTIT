package J05029;

import java.util.*;

/**
 * danh sach doanh nghiep nhan sinh vien thuc tap 2
 */

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
        int n=scanner.nextInt();
        while(n-->0){
            int a=scanner.nextInt(), b=scanner.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for (DoanhNghiep doanhNghiep : arr) {
                if(doanhNghiep.getSoLuong()>=a &&doanhNghiep.getSoLuong()<=b)
                    System.out.println(doanhNghiep);
            }
        }
        scanner.close();
    }
}

