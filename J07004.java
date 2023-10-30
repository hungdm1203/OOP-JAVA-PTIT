import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * so khac nhau trong file-1
 */
public class J07004 {

    public static void main(String[] args) throws IOException{
        Scanner scanner=new Scanner(new File("DATA.in"));
        int a[]=new int[1000];
        while (scanner.hasNextInt()) {
            a[scanner.nextInt()]++;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}