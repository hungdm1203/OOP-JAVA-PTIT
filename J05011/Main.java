package J05011;

import java.util.*;

/**
 * tinh gio
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        ArrayList<Gamer> ds=new ArrayList<>();
        while (t-->0) {
            String id=scanner.nextLine() ,name=scanner.nextLine(), start[]=scanner.nextLine().split(":"), end[]=scanner.nextLine().split(":");
            int time=Integer.valueOf(end[0])*60+Integer.valueOf(end[1])-Integer.valueOf(start[0])*60-Integer.valueOf(start[1]);
            Gamer gamer=new Gamer(id,name,time);
            ds.add(gamer);
        }
        Collections.sort(ds);
        for (Gamer gamer : ds) {
            System.out.println(gamer);
        }
        scanner.close();
    }
}
