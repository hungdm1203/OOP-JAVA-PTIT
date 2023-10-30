package J05059;

import java.util.*;

/**
 * xac dinh danh sach trung tuyen
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<ThiSinh> ds=new ArrayList<>();
        while (t-->0) {
            scanner.nextLine();
            ds.add(new ThiSinh(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        }

        t=scanner.nextInt();
        Collections.sort(ds);
        double tmp=0;
        for (ThiSinh thiSinh : ds) {
            if(t>0){
                t--;
                tmp=thiSinh.getSum();
            }
        }
        System.out.printf("%.1f\n",tmp);
        for (ThiSinh thiSinh : ds) {
            if(thiSinh.getSum()>=tmp){
                System.out.println(thiSinh+" TRUNG TUYEN");
            } else System.out.println(thiSinh+" TRUOT");
        }
    }
    
}
