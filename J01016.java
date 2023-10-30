import java.util.Scanner;

/**
 * chu so 4 va chu so 7
 */
public class J01016 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=1;
        while(t-->0){
            String s= scanner.nextLine();
            int dem=0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='4'||s.charAt(i)=='7'){
                    dem++;
                }
            }
            if(dem==4 || dem==7){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }
}