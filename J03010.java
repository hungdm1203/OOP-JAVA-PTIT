import java.util.*;
import java.util.Scanner;

/**
 * dia chi email
 */
public class J03010 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        HashMap<String,Integer> strMap=new HashMap<>();
        while (t-->0) {
            String str[]=scanner.nextLine().trim().split("\\s+");
            String res=str[str.length-1].toLowerCase();
            for (int i = 0; i < str.length-1; i++) {
                res=res+str[i].substring(0, 1).toLowerCase();
            }
            if(!strMap.containsKey(res)){
                System.out.println(res+"@ptit.edu.vn");
                strMap.put(res, 2);
            } else{
                System.out.println(res+strMap.get(res).toString()+"@ptit.edu.vn");
                strMap.put(res, strMap.get(res)+1);
            }
        }
        scanner.close();
    }
}