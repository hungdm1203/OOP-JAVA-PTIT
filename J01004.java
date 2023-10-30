import java.util.*;

/**
 * so nguyen to
 */
public class J01004 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            if(nto(n)){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }
    public static boolean nto(int n){
        for(int i=2;i<=Math.pow(n,0.5);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}