package J07053;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * xet tuyen
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("XETTUYEN.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<ThiSinh> ds=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ds.add(new ThiSinh(i,scanner.nextLine().trim(),scanner.nextLine().trim(),scanner.nextLine().trim(),scanner.nextLine().trim()));
        }

        for (ThiSinh thiSinh : ds) {
            System.out.println(thiSinh);
        }
    }
}