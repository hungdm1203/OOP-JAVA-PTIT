import java.util.Scanner;

/**
 * dien thoai cuc gach
 */
public class J03021 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            build(s.toLowerCase());
        }
        scanner.close();
    }

    public static void build(String s){
        String a[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String ss="";
        for (int i = 0; i < s.length(); i++) {
            for (int j=0;j<a.length;j++) {
                if (a[j].contains(s.charAt(i)+"")) {
                    ss=ss+(j+2);
                }
            }
        }
        if(check(ss)){
            System.out.println("YES");
        } else System.out.println("NO");
    }

    public static boolean check(String s){
        StringBuilder x=new StringBuilder(s);
        return s.equals(x.reverse().toString());
    }
}