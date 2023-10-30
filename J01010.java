import java.util.Scanner;

/**
 * cat doi
 */
public class J01010 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            if(check(s)==0){
                System.out.println("INVALID");
            } else System.out.println(check(s));
        }
        scanner.close();
    }
    public static long check(String s){
        String ss="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0' || s.charAt(i)=='8' || s.charAt(i)=='9'){
                ss=ss+"0";
            } else if (s.charAt(i)=='1') {
                ss=ss+"1";
            } else {
                return 0;
            }
        }
        return Long.parseLong(ss);
    }
}