package J07084;

import java.io.*;
import java.util.*;

/*
 * thoi gian online lien tuc
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("ONLINE.in"));
        int n=Integer.valueOf(sc.nextLine());
        ArrayList<Player> list=new ArrayList<>();
        while (n-->0) {
            Player p=new Player(sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(p);
        }
        Collections.sort(list);
        for (Player player : list) {
            System.out.println(player);
        }
    }
}
