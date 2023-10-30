import java.util.Scanner;

/**
 * bien so dep
 */
public class J03040 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            int a[]=new int[5];
            a[0]=s.charAt(5)-'0';
            a[1]=s.charAt(6)-'0';
            a[2]=s.charAt(7)-'0';
            a[3]=s.charAt(9)-'0';
            a[4]=s.charAt(10)-'0';
            if(test1(a) || test2(a) || test3(a)){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }

    public static boolean test1(int a[]){
        return (a[0]==a[1] && a[1]==a[2] && a[3]==a[4]);
    }
    public static boolean test2(int a[]){
        return (a[0]<a[1] && a[1]<a[2] && a[2]<a[3] && a[3]<a[4]);
    }
    public static boolean test3(int a[]){
        for (int i : a) {
            if(i!=6 && i!=8){
                return false;
            }
        }
        return true;
    }
}