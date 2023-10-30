package J07073;
/*
 * dang ki hinh thuc giang day
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("MONHOC.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<Subject> list=new ArrayList<>();
        while (n-->0) {
            list.add(new Subject(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(list);
        for (Subject subject : list) {
            if(!subject.getTH().equals("Truc tiep")) System.out.println(subject);
        }
    }
}
