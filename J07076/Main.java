package J07076;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("MATRIX.in"));
        int t=Integer.valueOf(scanner.nextLine());
        while (t-->0) {
            String str[]=scanner.nextLine().split("\\s+"), s=scanner.nextLine();
            Matrix m=new Matrix(Integer.valueOf(str[0]), Integer.valueOf(str[1]));
            m.setMatrix(s);
            m.sapXep(Integer.valueOf(str[2])-1);
            m.toStr();
        }
    }
}
