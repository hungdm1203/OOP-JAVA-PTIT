package J07041;

import java.io.*;
import java.util.*;

/**
 * liet ke cap so-1
 */
public class Main {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> listP=(ArrayList<Pair>) in.readObject();
        ArrayList<Pair> res=new ArrayList<>();
        HashSet<Pair> hm=new HashSet<>();
        for (Pair pair : listP) {
            if(!hm.contains(pair)){
                res.add(pair);
                hm.add(pair);
            }
        }
        Collections.sort(res);
        for (Pair pair : res) {
            if(pair.getFirst()<pair.getSecond()) System.out.println(pair);
        }
    }
}
