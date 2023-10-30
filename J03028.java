import java.util.Scanner;

/**
 * ma hoa drm
 */
public class J03028 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine(), s1=s.substring(0, s.length()/2), s2=s.substring(s.length()/2);
            
            int t1=0, t2=0;
            for (int i = 0; i < s1.length(); i++) {
                t1=t1+a.indexOf(s1.substring(i, i+1));
                t2=t2+a.indexOf(s2.substring(i, i+1));
            }
            String tmp1="", tmp2="";
            for(int i=0;i<s1.length();i++){
                tmp1=tmp1+a.charAt((a.indexOf(s1.substring(i, i+1))+t1)%26);
                tmp2=tmp2+a.charAt((a.indexOf(s2.substring(i, i+1))+t2)%26);
            }
            
            s="";
            for(int i=0;i<tmp1.length();i++){
                s=s+a.charAt((a.indexOf(tmp1.substring(i, i+1))+a.indexOf(tmp2.substring(i, i+1)))%26);
            }
            System.out.println(s);
        }
        scanner.close();
    }
    
}