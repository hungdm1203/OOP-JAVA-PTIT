import java.util.*;

/**
 * so lien ke
 */
public class J01017 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while(t-->0){
            String s=scanner.nextLine();
            int check=1;
            for (int i = 0; i < s.length() -1; i++) {
                if(Math.abs((s.charAt(i)-'0') - (s.charAt(i+1)-'0'))!=1){
                    check=0;
                    break;
                }
            }
            if(check==1) System.out.println("YES");
            else System.out.println("NO");
            
        }
        scanner.close();
    }
}