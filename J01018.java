import java.util.Scanner;

/**
 * so khong lien ke
 */
public class J01018 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            int check=1,sum=0;
            for (int i = 0; i < s.length()-1; i++) {
                if(Math.abs(s.charAt(i)-'0' - (s.charAt(i+1)-'0')) != 2){
                    check=0;
                }
                sum=sum + Character.getNumericValue(s.charAt(i));
            }
            if( (sum + s.charAt(s.length()-1)-'0') % 10 != 0 ){
                check=0;
            }
            if(check==1) System.out.println("YES");
            else System.out.println("NO");
        }
        scanner.close();
    }
}