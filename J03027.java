import java.util.Scanner;

/**
 * rut gon xau ki tu
 */
public class J03027 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        StringBuilder ss=new StringBuilder(s);
        int i=0;
        while (ss.length()>0 && i<ss.length()-1) {
            if (ss.charAt(i)==ss.charAt(i+1)){
                ss.delete(i, i+2);
                i=-1;
            }
            System.out.println(ss);
            i++;
        }
        if(ss.length()==0){
            System.out.println("Empty String");
        } else System.out.println(ss);
        scanner.close();
    }
}