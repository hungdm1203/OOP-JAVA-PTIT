package J07072;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
 * chuan hoa va sap xep
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DANHSACH.in"));
        ArrayList<Person> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String str[]=scanner.nextLine().toUpperCase().trim().split("\\s+");
            String res="";
            for (int j = 0; j < str.length; j++) {
                if(j!=str.length-1) res=res+str[j].charAt(0)+str[j].substring(1).toLowerCase()+" ";
                else res=res+str[j].charAt(0)+str[j].substring(1).toLowerCase();
            }
            list.add(new Person(res));
        }

        Collections.sort(list);
        for (Person person : list) {
            System.out.println(person);
        }

    }
}
