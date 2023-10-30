package J05019;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * luong mua trung binh
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<Tram> ds=new ArrayList<>();
        ArrayList<String> dsName=new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            String name=scanner.nextLine(), start=scanner.nextLine(), end=scanner.nextLine();
            int pmm=scanner.nextInt();
            if(!dsName.contains(name)){
                Tram tram=new Tram(i, name);
                tram.setTime(start, end);
                tram.setPmm(pmm);
                ds.add(tram);
                dsName.add(name);
            } else{
                int x=dsName.indexOf(name);
                ds.get(x).setTime(start, end);
                ds.get(x).setPmm(pmm);
            }
        }

        for (Tram tram : ds) {
            tram.setTB();
            System.out.println(tram);
        }
        scanner.close();
    }
    
}
