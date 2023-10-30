import java.util.*;

/**
 * thu gon day so
 */
public class J02017 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        for (int i = 0; i < a.size()-1; i++) {
            if((a.get(i)+a.get(i+1))%2==0){
                a.remove(i);
                a.remove(i);
                i=-1;
            }
        }
        System.out.println(a.size());
        scanner.close();
    }
}