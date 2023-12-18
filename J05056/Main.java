package J05056;
import java.util.*;

/**
 * xep hang van dong vien
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); scanner.nextLine();
        ArrayList<VanDongVien> ds=new ArrayList<>();

        for(int i=1;i<=t;i++){
            String name=scanner.nextLine(), dob=scanner.nextLine(), start=scanner.nextLine(), end=scanner.nextLine();
            int age=2021-Integer.valueOf(dob.substring(6));
            String a[]=start.split(":"), b[]= end.split(":");
            int time=(Integer.valueOf(b[0])-Integer.valueOf(a[0]))*3600+(Integer.valueOf(b[1])-Integer.valueOf(a[1]))*60+Integer.valueOf(b[2])-Integer.valueOf(a[2]);
            VanDongVien v=new VanDongVien(i,name,start,end,age,time);
            
            ds.add(v);
        }

        Collections.sort(ds);
        int dem=1;
        VanDongVien v=ds.get(0);
        v.setRank(1);
        for (VanDongVien vanDongVien : ds) {
            if(vanDongVien.getThanhTich()==v.getThanhTich()){
                vanDongVien.setRank(v.getRank());
            } else{
                vanDongVien.setRank(dem);
                v=vanDongVien;
            }
            dem++;
            System.out.println(vanDongVien);
        }

        scanner.close();
    }
}


