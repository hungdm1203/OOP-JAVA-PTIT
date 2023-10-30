package J05060;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ket qua xet tuyen
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<PhuHo> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            ds.add(new PhuHo(i,scanner.nextLine(),scanner.nextLine(),scanner.nextDouble(),scanner.nextDouble()));
        }

        Collections.sort(ds);
        for (PhuHo phuHo : ds) {
            System.out.println(phuHo);
        }
        scanner.close();
    }
    
}

