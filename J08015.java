import java.util.*;

/**
 * cap so co tong bang k
 */
public class J08015 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt(), k=scanner.nextInt();
            HashMap<Long,Integer> hmap=new HashMap<>();
            long dem=0;
            for (int i = 0; i < n; i++) {
                long x=scanner.nextLong();
                if(hmap.containsKey(k-x)){
                    dem+=hmap.get(k-x);
                }
                if(!hmap.containsKey(x)){
                    hmap.put(x, 1);
                } else{
                    hmap.put(x, hmap.get(x)+1);
                }
            }
            System.out.println(dem);
        }
        scanner.close();
    }
}