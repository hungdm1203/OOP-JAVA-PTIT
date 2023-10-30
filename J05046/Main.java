package J05046;

import java.util.*;

/**
 * bang ke nhap kho
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<MatHang> ds=new ArrayList<>();
        TreeMap<String,Integer> dsID=new TreeMap<>(); 
        for(int i=1;i<=t;i++){
            String id="", name=scanner.nextLine(), sl=scanner.nextLine(), dg=scanner.nextLine();
            String str[]=name.split("\\s+");
            for (int j=0;j<=1;j++) {
                id=id+str[j].substring(0, 1).toUpperCase();
            }
            if(dsID.containsKey(id)){
                dsID.put(id, dsID.get(id)+1);
                id=id+String.format("%02d",dsID.get(id));
            } else{
                dsID.put(id, 1);
                id=id+"01";
            }

            ds.add(new MatHang(id,name,sl,dg));
        }
        for (MatHang matHang : ds) {
            System.out.println(matHang);
        }
        scanner.close();
    }
    
}


