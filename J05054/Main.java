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
        ArrayList<Double> res= new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            String name=scanner.nextLine();
            double score=scanner.nextDouble();
            ds.add(new HocSinh(i,name,score));
            res.add(score);
        }

        Collections.sort(res);
        int tmp[]=new int[t+1], dem=1;
        tmp[t-1]=1;
        for (int i = t-2; i >=0; i--) {
            if(res.get(i).equals(res.get(i+1))){
                tmp[i]=tmp[i+1];
                dem++;
            } else{
                dem++;                                  //5.9 9.2 9.2 9.5
                tmp[i]=dem;                             //        2   1
            }
        }

        for (HocSinh i : ds) {
            int x=res.indexOf(i.getScore());
            System.out.println(i+" "+tmp[x]);
        }

        scanner.close();
    }
    
}





