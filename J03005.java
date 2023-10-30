import java.util.Scanner;

/**
 * chuan hoa xau ho ten 2
 */
public class J03005 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s[]= scanner.nextLine().trim().split("\\s+");
            String ss="";
            for (int i = 1; i < s.length; i++) {
                if(i!=s.length-1){
                    ss= ss+s[i].substring(0, 1).toUpperCase()+s[i].substring(1).toLowerCase()+" ";
                } else ss=ss+s[i].substring(0, 1).toUpperCase()+s[i].substring(1).toLowerCase()+", ";
            }
            ss=ss+s[0].toUpperCase();
            System.out.println(ss);
        }
        scanner.close();
    }
}