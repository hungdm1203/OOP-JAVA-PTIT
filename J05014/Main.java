package J05014;

import java.util.*;

/**
 * tuyen giao vien
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<Teacher> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            ds.add(new Teacher(i, scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextDouble()));
        }

        Collections.sort(ds);
        for (Teacher teacher : ds) {
            System.out.println(teacher);
        }
        scanner.close();
    }
    
}
