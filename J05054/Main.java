package J05054;

import java.util.*;

/**
 * xep hang hoc sinh
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<HocSinh> ds=new ArrayList<>();
        ArrayList<HocSinh> res= new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            String name=scanner.nextLine();
            double score=scanner.nextDouble();
            HocSinh h=new HocSinh(i,name,score);
            ds.add(h);
            res.add(h);
        }

        Collections.sort(ds);
        HocSinh h=ds.get(0);
        int dem=1;
        h.setRank(1);
        for (HocSinh hocSinh : ds) {
            if (h.getScore()==hocSinh.getScore()) {
                hocSinh.setRank(h.getRank());
            } else{
                hocSinh.setRank(dem);
                h=hocSinh;
            }
            dem++;
        }

        for (HocSinh hocSinh : res) {
            System.out.println(hocSinh);
        }

        scanner.close();
    }
    
}





