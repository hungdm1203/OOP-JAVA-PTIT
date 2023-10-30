package TH12;


import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            ArrayList<Long> arr=new ArrayList<>();
            Map<Long,Integer> ds=new HashMap<>();
            for(int i=0;i<n;i++) {
                long tmp=scanner.nextLong();
                if(ds.containsKey(tmp)){
                    ds.put(tmp, ds.get(tmp)+1);
                } else {
                    ds.put(tmp, 1);
                    arr.add(tmp);
                }
            }

            ArrayList<Number> res=new ArrayList<>();
            for (Long l : ds.keySet()) {
                res.add(new Number(l,ds.get(l),arr.indexOf(l)));
            }
            Collections.sort(res);
            for (Number num : res) {
                for(int i=0;i<num.getA2();i++){
                    System.out.print(num.getA1()+" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

