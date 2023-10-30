package J07084;

import java.io.*;
import java.util.*;

/*
 * thoi gian online lien tuc
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("ONLINE.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<Player> list=new ArrayList<>();
        while (n-->0) {
            String name=scanner.nextLine();
            String in[]=scanner.nextLine().split("\\s+"), out[]=scanner.nextLine().split("\\s+");
            list.add(new Player(name, in[0], out[0], in[1], out[1]));
        }

        Collections.sort(list);
        for (Player player : list) {
            System.out.println(player);
        }
    }
}
