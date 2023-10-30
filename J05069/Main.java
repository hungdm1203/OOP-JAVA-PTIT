package J05069;
import java.util.*;

/**
 * cau lac bo bong da-1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); 
        ArrayList<Club> ds=new ArrayList<>();
        ArrayList<Match> arr=new ArrayList<>();
        while (t-->0) {
            scanner.nextLine();
            ds.add(new Club(scanner.nextLine(),scanner.nextLine(),scanner.nextInt()));
        }
        scanner.nextLine();
        t=scanner.nextInt();scanner.nextLine();
        while (t-->0) {
            String str[]=scanner.nextLine().trim().split("\\s+");
            for (Club c : ds) {
                if(str[0].substring(1, 3).equals(c.getIDclub())){
                    c.setDoanhthu(Long.valueOf(str[1]));
                    arr.add(new Match(str[0], Long.valueOf(str[1]), c));
                }
            }
        }

        Collections.sort(arr);
        for (Match m : arr) {
            System.out.println(m);
        }
        scanner.close();
    }
}