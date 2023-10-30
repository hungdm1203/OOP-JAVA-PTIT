package J07059;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

/*
 * danh sach ca thi
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("CATHI.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<CaThi> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new CaThi(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(list);
        for (CaThi caThi : list) {
            System.out.println(caThi);
        }
    }
}
