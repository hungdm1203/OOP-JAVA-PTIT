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
        ArrayList<Integer> stt=new ArrayList<>();

        for(int i=1;i<=t;i++){
            String name=scanner.nextLine(), dob=scanner.nextLine(), start=scanner.nextLine(), end=scanner.nextLine();
            int age=2021-Integer.valueOf(dob.substring(6));
            String a[]=start.split(":"), b[]= end.split(":");
            int time=(Integer.valueOf(b[0])-Integer.valueOf(a[0]))*3600+(Integer.valueOf(b[1])-Integer.valueOf(a[1]))*60+Integer.valueOf(b[2])-Integer.valueOf(a[2]);

            ds.add(new VanDongVien(i,name,start,end,age,time));
            stt.add(ds.get(i-1).getThanhTich());
        }

        Collections.sort(stt);
        int res[]=new int[t], dem=1;
        res[0]=1;
        long tmp=stt.get(0);
        for (int i=1;i<t;i++){
            if(stt.get(i).equals(tmp)){
                res[i]=res[i-1];
                dem++;
            } else{
                dem++;
                res[i]=dem;
                tmp=stt.get(i);
            }
        }
        

        Collections.sort(ds);
        for (VanDongVien vanDongVien : ds) {
            int x=stt.indexOf(vanDongVien.getThanhTich());
            System.out.println(vanDongVien+" "+res[x]);
        }

        scanner.close();
    }
}


