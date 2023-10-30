package J06008;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * tinh gio chuan cho tung giang vien
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        ArrayList<Subject> listS = new ArrayList<>();
        ArrayList<Teacher> listT = new ArrayList<>();

        while (n-- > 0) {
            String s = scanner.nextLine();
            int x = s.indexOf(" ");
            listS.add(new Subject(s.substring(0, x), s.substring(x + 1)));
        }

        n = Integer.valueOf(scanner.nextLine());
        while (n-- > 0) {
            String s = scanner.nextLine();
            int x = s.indexOf(" ");
            listT.add(new Teacher(s.substring(0, x), s.substring(x + 1)));
        }

        n = Integer.valueOf(scanner.nextLine());
        while (n-- > 0) {
            String str[] = scanner.nextLine().split("\\s");
            Teacher teach=null;
            for (Teacher t : listT) {
                if (t.getId().equals(str[0])) {
                    teach=t;
                    break;
                }
            }
            for (Subject s : listS) {
                if (s.getId().equals(str[1])) {
                    teach.setTimeSubject(s, Double.valueOf(str[2]));
                    break;
                }
            }

        }

        String s = scanner.nextLine();
        for (Teacher teacher : listT) {
            if (teacher.getId().equals(s))
                teacher.Res();
        }
        scanner.close();
    }

}
