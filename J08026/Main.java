package J08026;

import java.util.*;
 
/** 
 * bien doi s-t 
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt(), m=scanner.nextInt();
            ArrayList<Pair> ds=new ArrayList<>();
            HashSet<Integer> arr=new HashSet<>();
            ds.add(new Pair(n, 0));
            arr.add(n);
            while (!ds.isEmpty()) {
                int i=ds.get(0).getX(), j=ds.get(0).getY();
                if(i-1==m || i*2==m){
                    System.out.println(j+1);
                    break;
                }
                ds.remove(0);
                if(i-1>0 && !arr.contains(i-1)) {
                    arr.add(i-1);
                    ds.add(new Pair(i-1, j+1));
                }
                if(i*2>0 && i*2<=m*2 && !arr.contains(i*2)) {
                    ds.add(new Pair(i*2, j+1));
                    arr.add(i*2);
                }
            }
        }
        scanner.close();
    }
    
}
