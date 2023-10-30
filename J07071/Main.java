package J07071;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * ten viet tat
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DANHSACH.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<Person> list=new ArrayList<>();
        while (n-->0) {
            list.add(new Person(scanner.nextLine()));
        }

        Collections.sort(list);
        n=Integer.valueOf(scanner.nextLine());
        while (n-->0) {
            String s=scanner.nextLine();
            for (Person person : list) {
                person.build(s);
            }
        }
    }    
}
