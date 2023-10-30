package J06007;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * bang tinh gio chuan
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); scanner.nextLine();
        ArrayList<Subject> listSB=new ArrayList<>();
        ArrayList<Teacher> listT=new ArrayList<>();
        while (n-->0) {
            String s=scanner.nextLine();
            int x=s.indexOf(" ");
            listSB.add(new Subject(s.substring(0, x), s.substring(x+1)));
        }
        n=scanner.nextInt(); scanner.nextLine();
        while (n-->0) {
            String s=scanner.nextLine();
            int x=s.indexOf(" ");
            listT.add(new Teacher(s.substring(0, x), s.substring(x+1)));
        }
        n=scanner.nextInt(); scanner.nextLine();
        while (n-->0) {
            String str[]=scanner.nextLine().split("\\s+");
            for (Teacher t : listT) {
                if(t.getID().equals(str[0])) t.setTime(Double.valueOf(str[2]));
            }
        }

        for (Teacher teacher : listT) {
            System.out.println(teacher);
        }
    }
    
}

