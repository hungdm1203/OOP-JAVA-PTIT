package J04018;
import java.util.*;
/**
 * so phuc
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new java.util.Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            SoPhuc sp1=new SoPhuc(scanner.nextInt(),scanner.nextInt()), sp2=new SoPhuc(scanner.nextInt(),scanner.nextInt());
            SoPhuc spC=sp1.add(sp2).mul(sp1), spD=(sp1.add(sp2)).mul(sp1.add(sp2));
            System.out.println(spC+", "+spD);
        }
        scanner.close();
        
    }
    
}