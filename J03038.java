import java.util.*;

/**
 * danh dau chu cai
 */
public class J03038 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println(s.chars().distinct().count());
        scanner.close();


        // cach khac:
        // Scanner scanner=new Scanner(System.in);
        // String s=scanner.next();
        // ArrayList<Character> a=new ArrayList<>();
        // for (int i = 0; i < s.length(); i++) {
        //     if(!a.contains(s.charAt(i))){
        //         a.add(s.charAt(i));
        //     }
        // }
        // System.out.println(a.size());
        // scanner.close();
    }
}