import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * J07001
 */
public class J07001 {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DATA.in"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}