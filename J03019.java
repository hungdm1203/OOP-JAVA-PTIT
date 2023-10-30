import java.util.Scanner;

/**
 * xau con lon nhat
 */
public class J03019 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next(), res="";
        char tmp='a';
        
        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i)>=tmp){
                res=str.charAt(i)+res;
                tmp=str.charAt(i);
            }
        }
        System.out.println(res);
        scanner.close();
    }
}