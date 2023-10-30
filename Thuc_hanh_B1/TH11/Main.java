package TH11;

import java.io.*;
import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> ds=new ArrayList<>();
        ArrayList<String> ma=new ArrayList<>();
        while (scanner.hasNextLine()) {
            String s=scanner.nextLine();
            if(!ma.contains(s)){
                ma.add(s);
                ds.add(new MonHoc(s, scanner.nextLine(), scanner.nextLine()));
            } else{
                scanner.nextLine();
                scanner.nextLine();
            }
        }
        Collections.sort(ds);
        for (MonHoc mh : ds) {
            System.out.println(mh);
        }
    }
}
