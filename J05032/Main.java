package J05032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * tre nhat-gia nhat
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();scanner.nextLine();
        ArrayList<Person> ds=new ArrayList<>();
        while (t-->0) {
            ds.add(new Person(scanner.next(),scanner.next()));
        }
        Collections.sort(ds);
        System.out.printf(ds.get(0)+"\n"+ds.get(ds.size()-1));
        scanner.close();
    }
    
}
