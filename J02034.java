import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * bo sung day so
 */
public class J02034 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());        }
        Collections.sort(a);
        int check=0;
        for (int i = 1; i < a.get(n-1); i++) {
            if(!a.contains(i)){
                System.out.println(i);
                check=1;
            }
        }
        if(check==0){
            System.out.println("Excellent!");
        }
        scanner.close();
    }
}